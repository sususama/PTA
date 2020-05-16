package LeetCode.面试题;

public class CompressString {
    public String compressString(String s) {
        //首先记录下当前字符串的长度
        int oldLen = s.length();
        if (oldLen == 0 || oldLen <= 2) return s;
        /*
        * 存储新字符串
        * */
        int sum = 1;
        //将字符串转为数组
        char c[] = s.toCharArray();
        //因为不能直接在字符串上进行修改，所以我们用StringBuilder，并直接将第一个字符添加进去，因为它至少拥有一个字符
        StringBuilder sb = new StringBuilder().append(c[0]);
        //遍历，判断当前字符是不是和上一个字符相同
        for (int i = 1; i <= oldLen; i++){
            if (c[i] == c[i - 1])
                sum++;
            else {
                sb.append(sum).append(c[i]);
                sum = 1;
            }
        }
        //最后循环结束的时候最后一个字符的数字没有进行录入
        sb.append(sum);
        return oldLen <= sb.length() ? s : sb.toString();
    }
}
