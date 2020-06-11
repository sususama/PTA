package study;

import java.util.Arrays;

public class TwoChaptersTwo {
    public int greedy(int[] goods, int capacity){
        // goods 表示货物，capacity 表示能拿走的最大货物，货物不可分割
        // 将货物的质量进行排序
        Arrays.sort(goods);
        int temp = 0,answer = 0;
        // 遍历货物，从小到大，依次放上船
        for (int good : goods)
            // 如果当前货物质量小于最大能放的质量就计数
            if (temp + good <= capacity)
                answer++;
        return answer;
    }
}
