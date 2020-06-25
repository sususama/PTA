package LeetCode.OneToFiveHundred;

import java.util.Arrays;

public class Sixteen {
    public int threeSumClosest(int[] nums, int target) {
        // 排序，然后固定一个数，从后一个到末尾开始寻找
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        int len = nums.length;
        // 进行遍历
        for (int i = 0; i < len; i++){
            int start = i + 1, end = len - 1;
            while (start < end){
                int sum = nums[i] + nums[start] + nums[end];
                // 判断 sum 和 ans 跟 target 的差的绝对值，寻找最小的差距
                if (Math.abs(target - sum) < Math.abs(target - ans)) ans = sum;
                // 小了就将 start 右移，因为是按照顺寻排列的
                if (sum < target) start++;
                // 同理
                else if (sum > target) end--;
                // 此时就说明相等，直接返回 ans
                else return ans;
            }
        }
        return ans;
    }
}
