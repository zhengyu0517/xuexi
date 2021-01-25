package main.com.zhengyu.sort;

/**
 *冒泡算法
 */
public class BubbleSort {
//最佳情况：T(n) = O(n)
//最差情况：T(n) = O(n2)
//平均情况：T(n) = O(n2)
    public  int[] bubbleSort(int[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs.length - 1 - i; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    int num = arrs[j+1];
                    arrs[j+1] = arrs[j];
                    arrs[j] = num;
                }
            }
        }
        return arrs;
    }

}
