package study;

import java.util.Arrays;

public class TwoChaptersTwo {
    public int greedy(int[] goods, int capacity){
        Arrays.sort(goods);
        int temp = 0,answer = 0;
        for (int good : goods)
            if (temp + good < capacity)
                answer++;
        return answer;
    }
}
