package LeetCode.OneToFiveHundred;

public class FourHundredAndNine {
    public int longestPalindrome(String s) {
    //统计每个字母的个数，如果是偶数就放两边，如果是奇数就放中间，但是只能放一个奇数
        //用ASCII码统计字母个数，因为有大小写之分，所以要128个
        int [] num = new int[128];
        for (char c : s.toCharArray())
            num[c]++;
        int sum = 0;
        for (int i : num){
            //只用偶数个
            sum += (i/2)*2;
            //当sum为奇数的时候说明我们再中间已经有一个非偶数个的字母了
            if (i % 2 == 1 && sum % 2 ==0)
                sum ++;
        }
        return sum;
    }
}
