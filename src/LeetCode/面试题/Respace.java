package LeetCode.面试题;

import java.util.HashMap;
import java.util.Map;

public class Respace {
    public int respace(String[] dictionary, String sentence) {
        // 进行暴力寻找，找到字典中所有的能被找到的单词的长度
        int len = sentence.length();
        Map<String, Integer> hashMap = new HashMap<>();
        // 将所有的单词存入字典中
        for (int i = 0; i < dictionary.length; i++)
            hashMap.put(dictionary[i], dictionary[i].length());
        int[] dp = new int[len + 1];
        for (int i = 1; i < len; i++) {
            // 因为每次都要++，所以至少要加一
            dp[i] = dp[i - 1] + 1;
            for (int j = 0; j < i; j++)
                // 如果能在字典中找到的话,就找到数组中可以匹配的最小的数字
                if (hashMap.containsKey(sentence.substring(j, i)))
                    dp[i] = Math.min(dp[i],dp[j]);
        }
        return dp[len];
    }
}
