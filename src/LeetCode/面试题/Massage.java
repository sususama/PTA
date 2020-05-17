package LeetCode.面试题;

public class Massage {
    public int massage(int[] nums) {
        //dp问题，我们可以判断 i 或 i + 1 最终谁大的问题，最终求的是最长预约时间
        //因为选则了i就必须跳到一个接受 i + 2或 i + 3
        int len = nums.length;
        if (len == 0){
            return 0;
        }
        if (len == 1){
            return nums[0];
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++)
            dp[i] = Math.max(dp[i - 1],dp[i - 2] + nums[i]);
        return dp[len - 1];
    }
}
