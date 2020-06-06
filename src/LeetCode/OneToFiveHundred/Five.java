package LeetCode.OneToFiveHundred;

public class Five {
    public String longestPalindrome(String s) {
        int len = s.length();
        String answer = "";
        boolean dp [][] = new boolean[len][len];
        for (int i = len - 1; i >= 0; i--){
            for (int j = i; j < len; j++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (dp[i + 1][j - 1] || j - i < 2);
                if (dp[i][j] && j - i + 1 > answer.length()){
                    answer = s.substring(i, j + 1);
                }
            }
        }
        return answer;
    }
}


