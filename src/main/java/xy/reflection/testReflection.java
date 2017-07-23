package xy.reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by xy on 2017-07-23 16:02
 * 测试反射
 */
public class testReflection {

    public int age=10;
    public int getAge(){
        return age;
    }
    public int getSome(int i){
        return i;
    }

    public static void main(String[] args) throws Exception{
        Class<?> clazz=Class.forName("xy.reflection.testReflection");
        //无参
        Method method=clazz.getMethod("getAge");
        int i=(Integer) method.invoke(clazz.newInstance());
        System.out.println(i+"");
        //有参
        Method m=clazz.getDeclaredMethod("getSome", int.class);
        int j=(Integer) m.invoke(clazz.newInstance(),100);
        System.out.println(j+"");
    }

    @Test
    public void testMethod() throws Exception{
        Class<?> clazz=Class.forName("xy.reflection.testReflection");
        System.out.printf(clazz.getName());

        Field field=clazz.getDeclaredField("age");
        field.set(this,2);
        System.out.println(age+"");

    }
}

