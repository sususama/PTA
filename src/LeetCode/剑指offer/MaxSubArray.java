package LeetCode.剑指offer;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
//        int max = nums[0];
//        int temp = 0;
//        for (int num : nums){
//            if (temp > 0)
//                temp += num;
//            else
//                temp = num;
//            max = Math.max(max,temp);
//        }
//        return max;
        int max = nums[0];// 当前和的最大值
        int temp = nums[0];// 当前值和最大和
        for (int i = 0; i < nums.length; ++i){
            temp = Math.max(nums[i], nums[i]+ temp);
            max = Math.max(max, temp);
        }
        return max;
    }
}
