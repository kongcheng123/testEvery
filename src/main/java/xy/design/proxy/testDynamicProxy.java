package xy.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by xy on 2017-07-23 18:25
 * 测试动态代理
 */
public class testDynamicProxy {
    public static void main(String[] args) {
        student s=new student();
        proxyStudent ps=new proxyStudent(s);
        people p=(people) ps.getProxy();
        p.getName();
    }
}

interface people{
    public abstract void getName();
}
class student implements people{
    public void getName() {
        System.out.println("这是被代理对象");
    }
}
//动态代理
class proxyStudent implements InvocationHandler{
    private Object target;

    public proxyStudent(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=method.invoke(target,args);
        return result;
    }

    public Object getProxy(){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, this);
    }

}