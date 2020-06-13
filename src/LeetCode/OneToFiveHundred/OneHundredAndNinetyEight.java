package LeetCode.OneToFiveHundred;

public class OneHundredAndNinetyEight {
    public int rob(int[] nums) {
        //动态规划
        int prevMax = 0;
        int currMax = 0;
        // 最终状态就是最大和max
        //转移状态 max(dp[k-2]+Ak,dp[k-1])
        for (int x:nums){
            int temp = currMax;
            currMax = Math.max(prevMax + x,currMax);//当加上现在的钱数，判断哪条路径的钱最多
            prevMax = temp;
        }
        return currMax;
    }
}
