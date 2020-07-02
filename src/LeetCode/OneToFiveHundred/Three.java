package LeetCode.OneToFiveHundred;

import java.util.HashSet;
import java.util.Set;

public class Three {
    public int lengthOfLongestSubstring(String s) {
        // 哈希集合，判断是否出现重复的字符
        Set<Character> occ = new HashSet<Character>();
        int len = s.length();
        // 右指针，初始值为-1，相当于在数组的左边点，还没有开始
        int right = -1, ans = 0;
        char[] cs = s.toCharArray();
        for (int i = 0;i < len;i++) {
            // 左指针向右移动一格将原来左指针指向的值移除,当i=0的时候说明里面没有字符
            if (i != 0)
                occ.remove(cs[i - 1]);
            // 要判断右指针是否超过边界，并且集合里面不能有重复的元素
            while (right + 1 < len && !occ.contains(cs[right + 1])){
                // 移动右指针
                occ.add(cs[right + 1]);
                right++;
            }
            // 第 i 到 right 个字符是一个极长的无重复字符子串和之前的最大长度进行比较
            ans = Math.max(ans,right - i + 1);
        }
        return ans;
    }
}
