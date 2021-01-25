package test;

import main.com.zhengyu.sort.BubbleSort;
import main.com.zhengyu.sort.InsertSort;
import main.com.zhengyu.sort.SelectionSort;

public class SortTest {

    public static void main(String[] args){
        int[] arrs = {3,5,4,11,4,9,7,8,2,1,0,10,3};
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSort(arrs);
//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.selectionSort(arrs);
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(arrs);
        for(int i=0;i<arrs.length;i++) {
            System.out.println(arrs[i]);
        }
    }
}
