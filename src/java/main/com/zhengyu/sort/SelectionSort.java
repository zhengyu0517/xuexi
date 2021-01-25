package main.com.zhengyu.sort;

/**
 * 选择算法
 */
public class SelectionSort {
//最佳情况：T(n) = O(n2)
//最差情况：T(n) = O(n2)
//平均情况：T(n) = O(n2)
//选择排序 是表现最稳定的排序算法之一 ，因为无论什么数据进去都是O(n2)的时间复杂度 ，所以用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间了
    public  int[] selectionSort(int[] arrs) {
        for (int i = 0; i < arrs.length - 1; i++) {
            int minIndex = i;
            for(int j=i+1;j<arrs.length;j++){
                 if(arrs[j]<arrs[minIndex]){
                     minIndex = j;
                 }
            }
            int num = arrs[minIndex];
            arrs[minIndex] = arrs[i];
            arrs[i] = num;
        }
        return arrs;
    }
}
