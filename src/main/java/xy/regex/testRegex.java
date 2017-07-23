package xy.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xy on 2017-07-23 11:43
 * 测试正则表达式
 */
public class testRegex {

    public static void main(String[] args){

    }

    /**
     * 测试是否存在
     */
    @Test
    public void test(){
        //方法一
        String content = "I am noob from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);

        /**
         * 方法二
         * Pattern p=Pattern.compile(pattern);
         * Matcher matcher=p.matcher(content);
         * boolean b=matcher.matches();
         * System.out.println("字符串中是否包含了 'runoob' 子字符串? " + b);
         */
    }
    /**
     * 查找相关内容
     */
    @Test
    public void testFind(){
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "order\\s*(.*)\\s*placed";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );   //0 表示整个串
            System.out.println("Found value: " + m.group(1) );   //1 表示第一个括号里的字符串
        } else {
            System.out.println("NO MATCH");
        }
    }
}
