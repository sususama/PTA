package LeetCode.OneToFiveHundred;

import java.util.Arrays;

public class FourHundredsAndForty {
    // dp
    public int splitArray(int[] nums, int m) {
        int len = nums.length;
        // 存储每次最小值
        int[][] dp = new int[len + 1][m + 1];
        // 将其都置为最大，可以有效记录
        for (int i = 0; i <= len; i++)
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        // 记录数组的和
        int[] sub = new int[len + 1];
        // 对 sub 进行计算
        for(int i = 0; i < len; i ++)
            sub[i + 1] = sub[i] + nums[i];
        // 初始状态，因为刚开始确实是 0
        dp[0][0] = 0;
        // 进行遍历寻找
        for (int i = 1; i <= len; i++)
            // 由于我们不能分出空的子数组，因此合法的状态必须有 i ≥ j
            for (int j = 1; j <= Math.min(i, m); j++)
                for (int k = 0; k < i; k++)
                    // 如果数字不合法，就将其置为 MAX_VALUE
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[k][j - 1],sub[i] - sub[k]));
        return dp[len][m];
    }
}
