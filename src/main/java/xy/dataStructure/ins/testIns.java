package xy.dataStructure.ins;

import org.junit.Test;

/**
 * Created by xy on 2017-07-26 18:03
 * 插入排序
 */
public class testIns {
    private int[] a={1,6,2,3,10,9,7,5,8,4};

    @Test
    public void test(){
        int j=0;
        for( int i = 0;i < a.length;i++){
            int temp = a[i];
            for(j = i;j > 0 && temp < a[j-1];j--){
                a[j] = a[j-1];
            }
            a[j] = temp;
        }
        for (int num : a){
            System.out.println(num);
        }
    }
}
