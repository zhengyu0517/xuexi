package test.sf;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        int len = 0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            len ++;
            if(set.size() !=len){
                return true;
            }
        }
        return false;
    }
}
