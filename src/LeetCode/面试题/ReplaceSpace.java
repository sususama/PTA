package LeetCode.面试题;

public class ReplaceSpace {
    public String replaceSpace(String s) {
        // 先将字符串挨个遍历，若是空格，则替换，不是就加入StringBuilder
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()){
            if (c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }
}
