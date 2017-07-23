package xy.design;

/**
 * Created by xy on 2017-07-23 17:09
 * 测试代理模式
 *
 * 代理和真实个体要继承或实现相同的接口或抽象类
 *
 */
public class testProxy {

    public static void main(String[] args) {
        proxy proxy=new proxy();
        proxy.request();
    }

}
abstract class subject{
    public abstract void request();
}
class realSubject extends subject{

    @Override
    public void request() {
        System.out.println("真实个体");
    }
}
class proxy extends subject{
    realSubject realSubject;
    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new realSubject();
        }
        realSubject.request();
    }
}
