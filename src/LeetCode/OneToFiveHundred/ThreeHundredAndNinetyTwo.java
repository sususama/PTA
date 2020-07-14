package LeetCode.OneToFiveHundred;

public class ThreeHundredAndNinetyTwo {
    public boolean isSubsequence(String s, String t) {
        // s是否为t的子序列
        int sLen = s.length(),tLen = t.length();
        if (sLen == 0 )return true;
        if (sLen > tLen) return false;
        boolean temp [] [] = new boolean[sLen + 1][tLen + 1];
        //初始化
        for (int i = 0;i < tLen; i++)
            temp[0][i] = true;
        //进行动态规划
        //当t中出现了s的一个字符串之后将该行的所有数组后续全部转化为true
        for (int i = 1; i <= sLen; i++){
            for (int j = 1; j<=tLen; j++){
                if (s.charAt(i - 1) == t.charAt(j - 1))
                    temp[i][j] = temp[i -1][j - 1];
                else
                    temp[i][j] = temp[i][j - 1];
            }
        }
        return temp[sLen][tLen];
    }
}
