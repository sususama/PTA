package LeetCode.OneToFiveHundred;

public class Fourteen {
    public String longestCommonPrefix(String[] strS) {
        // 暴力法破解，第一个字符串的长度进行遍历，与后面的所有的字符串进行对比
        if (strS == null || strS.length == 0) return "";
        int len = strS[0].length();
        char[] cs = strS[0].toCharArray();
        for (int i = 0; i < len; i++){
            char c = cs[i];
            // 从第二个开始进行遍历，因为第一个是作为比较对象的
            for (int j = 1; j < strS.length; j++)
                // 如果当前下标已经和后面的长度一样长就说明前面已经全部匹配了
                // 当两个字符不同时也进行返还
                if (i == strS[j].length() || strS[j].charAt(i) != c)
                    return strS[0].substring(0,i);
        }
        return strS[0];
    }
}
