package LeetCode.面试题;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0;i < prices.length;i++){
            if (prices[i] <= min)
                min = prices[i];
            max = Math.max(prices[i] - min, max);
        }
        return max;
    }
}
