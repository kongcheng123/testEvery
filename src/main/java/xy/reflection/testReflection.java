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

    public static void main(String[] args) throws Exception{
        Class<?> clazz=Class.forName("xy.reflection.testReflection");
        Method method=clazz.getMethod("getAge");
        int i=(Integer) method.invoke(clazz.newInstance());
        System.out.printf(i+"");
    }

    @Test
    public void test() throws Exception{
        Class<?> clazz=Class.forName("xy.reflection.testReflection");
        Field field=clazz.getDeclaredField("age");
        field.set(this,2);
        System.out.printf(age+"");
    }
}

