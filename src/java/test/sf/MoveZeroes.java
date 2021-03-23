package test.sf;

public class MoveZeroes {
    //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    public void moveZeroes(int[] nums) {
//        for(int i = 0; i<nums.length;i++){
//            if(nums[i] == 0){
//                for(int j = i+1;j<nums.length;j++){
//                    if(nums[j] !=0){
//                        int temp =nums[j];
//                        nums[j] = nums[i];
//                        nums[i] = temp;
//                        break;
//                    }
//                }
//            }
//        }
        int j= 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j ++ ;
                break;
            }
        }
    }
}
