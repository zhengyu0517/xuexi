package test.sf;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int num : nums){
            sum = sum  + num;
        }
        int nsum = n*(1+n)/2;
        return nsum-sum;
    }

    public static void main(String[] args){
        int[] nums ={1};
        missingNumber(nums);
    }

}
