package LeetCode.OneToFiveHundred;

import java.util.HashMap;

public class ThreeHundredAndEighthSeven {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] cs = s.toCharArray();
        for (char c : cs)// 统计s中的所有字母的个数
            // getOrDefault意思就是当Map集合中有这个key时，就使用这个key值，如果没有就使用默认值defaultValue
            map.put(c,map.getOrDefault(c,0) + 1);
        // 这里进行按照顺序对s进行遍历，是为了找到第一个val为1的key
        for (int i = 0;i < cs.length;i++) {
            if (map.get(cs[i]) == 1)
                return i;
        }
        return -1;
    }
}
