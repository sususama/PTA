package LeetCode.剑指offer;

public class ReverseWords {
    public String reverseWords(String s) {
        // 除去首尾空格并根据空跟进行拆分
        String[] ss = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = ss.length - 1; i >= 0; i--){
            // 当遇到空单词直接跳过
            if (ss[i].equals(""))continue;
            //其余的直接加空格放入sb中
            sb.append(ss[i]+" ");
        }
        //除去尾部空格
        return sb.toString().trim();
    }
}
