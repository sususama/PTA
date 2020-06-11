package study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoChaptersThree {
    public int greedy(int[] w, int[] v, int m){
        // w 为质量列表，v 为价值列表，m 为最大携带量，质量可分割
        int len = w.length;
        Map<Integer, Integer> val = new HashMap<>();
        int[] value = new int[len];
        // 首先把货物按照性价比大小进行排序，这里采用的用 map 的 key 记录原下标，用数组对性价比排序
        for (int i = 0; i < len; i++) {
            int temp = v[i] / w[i];
            val.put(temp, i);
            value[i] = temp;
        }
        Arrays.sort(value);
        int answer = 0, mass = 0;
        // 进行遍历，写出能装的最大价值的物品
        for (int i = len - 1; i >= 0; i--){
            int ind = val.get(value[i]);
            // 如果当前已装质量等于最大质量，就将其价值加到最大价值里去，否则就将其击碎，带上能带的最大质量
            if (mass + w[ind] <= m)
                answer += v[ind];
            else
                answer += ((m + w[ind] - m) * value[i]);
        }
        return answer;
    }
}
