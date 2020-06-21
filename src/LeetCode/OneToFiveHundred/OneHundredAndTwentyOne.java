package LeetCode.OneToFiveHundred;

public class OneHundredAndTwentyOne {
    public int maxProfit(int[] prices) {
        if (prices.length==0)
            return 0;
        //思路：   首先设两个数，一个保存最小数，一个保存最大差值
        int min = prices[0], maxNum = 0;
        for (int i = 0; i < prices.length; i++){
            //让值始终保持最小
            if (min > prices[i])
                min = prices[i];
            //当当前值大于最小值的时候计算差值
            if (prices[i] > min && (prices[i] - min) > maxNum)
                maxNum = prices[i] - min;
        }
        int minPrice = Integer.MAX_VALUE;
        return maxNum;
        /*
        public class Solution {
            public int maxProfit(int prices[]) {
                int maxProfit = 0;
                for (int i = 0; i < prices.length - 1; i++) {
                    for (int j = i + 1; j < prices.length; j++) {
                        int profit = prices[j] - prices[i];
                        if (profit > maxProfit)
                            maxProfit = profit;
                    }
                }
                return maxProfit;
            }
        }


        * */
    }
}
