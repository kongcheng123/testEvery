package xy.dataStructure.sel;

import org.junit.Test;

/**
 * Created by xy on 2017-07-25 20:37
 * 选择排序
 */
public class testSel {
    private int[] a={1,6,2,3,10,9,7,5,8,4};

    /**
     * 原理:
     * 重复（元素个数-1）次
     *   把第一个没有排序过的元素设置为最小值
     *   遍历每个没有排序过的元素
     *   如果元素 < 现在的最小值
     *   将此元素设置成为新的最小值
     *   将最小值和第一个没有排序过的位置交换
     */
    @Test
    public void test(){
        for (int i = 0;i < a.length;i++){
            int min = a[i];
            int temp = min;
            for (int j = i;j < a.length;j++){
                if (a[j] < temp){
                    int t = temp;
                    temp = a[j];
                    a[j] = t;
                }
            }
            a[i] = temp;
        }

        for (int num : a){
            System.out.println(num);
        }
    }
}
