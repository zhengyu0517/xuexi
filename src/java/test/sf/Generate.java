package test.sf;

import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    //给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> lists = new ArrayList<>();
         for(int i=1;i<=numRows;i++){
             List<Integer> list = new ArrayList<>();
             if( i == 1){
                 list.add(1);
                 lists.add(list);
                 continue;
             }
             list.add(1);
             List<Integer> uplists = lists.get(i-1);
             for(int a = 1; a<i ;a++){
                 list.add(uplists.get(a-1) + uplists.get(a));
             }
             list.add(1);
             lists.add(list);
         }
         return lists;
    }
}
