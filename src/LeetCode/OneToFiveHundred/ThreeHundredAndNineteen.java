package LeetCode.OneToFiveHundred;

public class ThreeHundredAndNineteen {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
/*        //分三段直接进行判断
        //第一段直接全true
        //第二段每搁i个改变一次（第i个改变）
        //第三段直接将最后一个改变
        if (n==1) return 1;
        boolean [] sum = new boolean [n];
        //i即是下标
        for (int i = 0; i < n; i++){
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    sum[j] = true;
                }
                continue;
            }
            if (i <= n-1 && i > 0 ) {
                for (int j = i; j < n; j += i) {
                    if (j < n) {
                        sum[j] = !sum[j];
                    }
                }
                continue;
            }
        }
        int d = 0;
        for (boolean temp:sum)
            if (temp)
                d++;
        return d;*/
    }
}
