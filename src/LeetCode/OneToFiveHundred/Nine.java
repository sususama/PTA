package LeetCode.OneToFiveHundred;

public class Nine {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        StringBuffer sb1 = new StringBuffer(str);
        String s = sb.toString();
        String s1 = sb1.toString();
        return s.equals(s1);
    }
}
