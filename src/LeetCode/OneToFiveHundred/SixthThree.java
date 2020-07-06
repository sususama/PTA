package LeetCode.OneToFiveHundred;

public class SixthThree {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[] dp = new int[n];
        // 判断 [0][0] 是不是障碍
        dp[0] = obstacleGrid[0][0] == 0 ? 1 : 0;
        // 进行遍历
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n; j++){
                // 如果遇到障碍物，就说明这条路过不去，将其置零
                if (obstacleGrid[i][j] == 1){
                    dp[j] = 0;
                    continue;
                }
                // 这条路可以走，并且当前下标不是入口
                if (j - 1 >= 0 && obstacleGrid[i][j - 1] == 0)
                    dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}
