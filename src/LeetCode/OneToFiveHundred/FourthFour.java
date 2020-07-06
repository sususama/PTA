package LeetCode.OneToFiveHundred;

public class FourthFour {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        char[] ss = s.toCharArray();
        char[] ps = p.toCharArray();
        // 初始化
        dp[0][0] = true;
        for (int i = 1; i <= n; ++i) {
            if (ps[i - 1] == '*')
                dp[0][i] = true;
            else
                break;
        }
        // 这种时候有两种情况，当i - 1和j - 1
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (ps[j - 1] == '*')
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                 else if (ps[j - 1] == '?' || ss[i - 1] == ps[j - 1])
                    dp[i][j] = dp[i - 1][j - 1];
            }
        }
        return dp[m][n];
    }
}
