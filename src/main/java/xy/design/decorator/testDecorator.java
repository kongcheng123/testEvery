package xy.design.decorator;

/**
 * Created by xy on 2017-07-25 22:05
 * 装饰者模式
 *      动态地将责任附加到对象上
 */
public class testDecorator {
    public static void main(String[] args) {
        Man man = new Man();
        DecoratorA a = new DecoratorA();
        DecoratorB b = new DecoratorB();
        a.setPerson(man);
        b.setPerson(a);
        b.eat();

    }
}

interface Person{
    public void eat();
}

class Man implements Person{
    public void eat() {
        System.out.println("男人在吃饭");
    }
}

abstract class Decorator implements Person{
    private Person person;

    public void setPerson(Person person){
        this.person = person;
    }

    public void eat(){
        person.eat();
    }
}

class DecoratorA extends Decorator{
    public void eat(){
        super.eat();
        System.out.println("A在吃饭");
    }
}

class DecoratorB extends Decorator{
    public void eat(){
        super.eat();
        System.out.println("B在吃饭");
    }
}