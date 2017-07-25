package xy.dataStructure.bub;

import org.junit.Test;

/**
 * Created by xy on 2017-07-24 23:50
 * 冒泡排序
 */
public class testBub {
    private int[] num={1,6,2,3,10,9,7,5,8,4};

    @Test
    public void test(){
        for (int i = 0;i < num.length;i++){
            for (int j = 0;j < num.length - i-1;j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        for (int a : num){
            System.out.println(a);
        }
    }

    /**
     * VisuAlgo图例方法
     */
    @Test
    public void testAnother(){
        boolean flag = false;
        do{
            flag = false;
        }while (flag == true);
    }

}
