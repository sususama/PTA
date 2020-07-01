package LeetCode.OneToFiveHundred;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OneHundredAndThirtyNine {
        /*
        动态规划算法，dp[i]表示s前i个字符能否拆分
        转移方程：dp[j] = dp[i] && check(s[i+1, j]);
        check(s[i+1, j])就是判断i+1到j这一段字符是否能够拆分
        其实，调整遍历顺序，这等价于s[i+1, j]是否是wordDict中的元素
        这个举个例子就很容易理解。
        假如wordDict=["apple", "pen", "code"],s = "applepencode";
        dp[8] = dp[5] + check("pen")
        翻译一下：前八位能否拆分取决于前五位能否拆分，加上五到八位是否属于字典
        （注意：i的顺序是从j-1 -> 0哦~
    */
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        // 我们从后往前遍历，在 wordDict 中进行寻找
        boolean[] dp = new boolean[len + 1];
        Map<String, Boolean> hashMap = new HashMap<>();
        // 将字典中所有的单词放入 hashmap 中方便查找
        for (String s1 : wordDict)
            hashMap.put(s1, true);
        dp[0] = true;
        // 从后往前遍历，寻找可以匹配的单词
        for (int j = 1; j <= len; j++)
            for (int i = j - 1; i >= 0; i--){
                dp[j] = dp[i - 1] && hashMap.getOrDefault(s.substring(i,j),false);
                if (dp[j]) break;// 如果找到了就返回
            }
        return dp[len];
    }
}
