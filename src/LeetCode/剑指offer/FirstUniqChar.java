package LeetCode.剑指offer;

import java.util.HashMap;

public class FirstUniqChar {
    public char firstUniqChar(String s) {
        HashMap<Character,Boolean> dic = new HashMap<>();
        char[] cs = s.toCharArray();
        for (char c : cs)//查找字典中是否有这个字符
            dic.put(c,!dic.containsKey(c));
        for (char c : cs)
            if (dic.get(c)) return c;
        return ' ';
    }
}
