package LeetCode.OneToFiveHundred;

public class ThirtyTwo {
    public int longestValidParentheses(String s) {
        // 默认将‘（’置为 0
        int max = 0;
        char[] cs = s.toCharArray();
        int len = s.length();
        int[] dp = new int[len];
        for (int i = 1; i < len; i++){
            // 如果，i 是‘）’就说明前面至少有一个完整的括号
            // 然后对 i - 1 进行判断，若还是‘）’，则说明至少有两个括号，依次往后推
            if (cs[i] == ')')
                if (cs[i - 1] == '(')
                    // 如果前两个都是‘）’进行判断，看前面有两个‘（’吗,并且防止指针指向数组外边，下面同理
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                else if (i - dp[i -1] > 0 && cs[i - dp[i - 1] - 1] == '(')
                    dp[i] = dp[i - 1] + ((i - dp[i - 1] >= 2) ? dp[i - dp[i - 1] - 2] : 0) + 2;
                max = Math.max(dp[i], max);
        }
        return max;
    }
}
