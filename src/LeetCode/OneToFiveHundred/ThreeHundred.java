package LeetCode.OneToFiveHundred;

public class ThreeHundred {
    public int lengthOfLIS(int[] nums) {
        //边界处理
        int len = nums.length;
        if (len == 0) return 0;
        int [] dp = new int[len];
        dp[0] = 1;
        int max = 1;//最小为1
        //双指针，将最长长度始终放在dp[i]，用maxVal标记当i下标时最长的上升序列
        for (int i = 0; i < len; i ++){
            int maxVal = 0;
            for (int j = i; j >= 0; j--) {
                if (nums[j] < nums[i])
                    //计算下标为i时最大的值
                    maxVal = Math.max(maxVal, dp[j]);
            }
            //若最大长度发生变化，则当下标为i时，最长子序列要加一，若不变maxVal值仍为0，最长子序列仍为1
            dp[i] = maxVal + 1;
            //取最大值
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
