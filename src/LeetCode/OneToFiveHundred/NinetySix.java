package LeetCode.OneToFiveHundred;

public class NinetySix {
    public int numTrees(int n) {
        // 每个节点都可能做跟，所以有 n 种可能
        // 当每个节点做跟的时候，左边共有 1 - i 个节点，右边共有 n - i 个节点
        int[] dp = new int[n + 1];
        // 边界处理，我们已知当 n 等于0或1的时候只有一种情况
        dp[0] = 1;
        dp[1] = 1;
        // 状态转换方程为 f[i] += f[j] * f[i - j]
        // 因为每个数为跟的时候左右子树的数量可以为 0 到 i 个
        // 要统计当节点为 i 的时候的所有情况就要  +=
        for (int i = 2; i <= n; i++)
            for (int j = 1; j <= i; j++)
                dp[i] += dp[j - 1] * dp[i - j];
        return dp[n];
    }
}
