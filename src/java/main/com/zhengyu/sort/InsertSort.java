package main.com.zhengyu.sort;

public class InsertSort {
//最佳情况：T(n) = O(n)
//最坏情况：T(n) = O(n2)
//平均情况：T(n) = O(n2)
// 插入排序（Insertion-Sort） 的算法描述是一种简单直观的排序算法。
// 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。插入排序在实现上，
// 通常采用in-place排序（即只需用到O(1)的额外空间的排序），因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
    public  int[] insertSort(int[] arrs) {

        int current;
        for (int i = 0; i < arrs.length - 1; i++) {
            current = arrs[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < arrs[preIndex]) {
                arrs[preIndex + 1] = arrs[preIndex];
                preIndex--;
            }
            arrs[preIndex + 1] = current;
        }
        return arrs;
    }
}
