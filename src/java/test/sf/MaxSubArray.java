package test.sf;

public class MaxSubArray {
    //给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
    //动态规划
    class Solution {
        public int maxSubArray(int[] nums) {
            int max = nums[0];
            int sum =0;
            for(int num:nums){
                if(sum>0){
                    sum += num;
                }else{
                    sum = num;
                }
                max = Math.max(max , sum);
            }
            return max;
        }
    }
}
