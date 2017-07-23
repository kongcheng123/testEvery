package xy.design;

import org.junit.Test;

/**
 * 单例模式
 */
public class testSingleton {
    public static void main(String[] args){
        Singleton s1=Singleton.getSingleton();
        Singleton s2=Singleton.getSingleton();

        //System.out.println(s1==s2);

        Singleton1 s11=Singleton1.getInstance();
        Singleton1 s12=Singleton1.getInstance();
        System.out.println(s11==s12);
    }

}
//懒汉式
class Singleton{
    private static Singleton singleton;
    private Singleton(){}
    public static Singleton getSingleton(){
        if(singleton == null){
            singleton =new Singleton();
        }
        return singleton;
    }

    //双重锁定
    public Singleton getSingletonByThread(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }
}

//饿汉式单例类.在类初始化时，已经自行实例化
class Singleton1 {
    private Singleton1() {}
    private static final Singleton1 single = new Singleton1();
    //静态工厂方法
    public static Singleton1 getInstance() {
        return single;
    }
}