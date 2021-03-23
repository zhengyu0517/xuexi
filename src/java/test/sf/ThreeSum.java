package test.sf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    //给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
    //
    //注意：答案中不可以包含重复的三元组。
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if(nums.length < 3) return lists;
        Arrays.sort(nums);
        if(nums[0] >=0) return lists;

        List<Integer> fnums = new ArrayList<>();
        List<Integer> znums = new ArrayList<>();
        for(int num:nums){
            if(num < 0){
                fnums.add(num);
            }else {
                znums.add(num);
            }
        }
        int need;
        if(fnums.size()>znums.size()){
            for(int i = 0;i<fnums.size();i++){
                for(int j =0;j < znums.size();j++){
                    if(fnums.get(i)+znums.get(j)>=0){
                    }
                }
            }
        }else{

        }
        return lists;
    }
}
