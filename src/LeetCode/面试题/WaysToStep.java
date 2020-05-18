package LeetCode.面试题;

public class WaysToStep {
    public int waysToStep(int n) {
        if (n <= 2) return n;
        if (n == 3) return 4;
        int mod = 1000000007;
        int [] dp = new int[n + 1];
        //边界处理
        dp[0] = 0; dp[1] = 1; dp[2] = 2; dp [3] = 4;
        //终极状态表示为dp(n)
        //状态转移方程为 方法数 = dp(n - 1) + dp(n - 2) + dp(n - 3)
        for (int i = 4; i <= n; i++){
            dp[i]=((dp[i - 1]%mod+dp[i - 2]%mod)%mod+dp[i - 3]%mod)%mod;
        }
        return dp[n];
    }
}
