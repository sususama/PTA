package LeetCode.OneToFiveHundred;

import java.util.List;

public class OneHundredAndTwenty {
    public int minimumTotal(List<List<Integer>> triangle) {
        // dp 的最小路径问题
        if (triangle == null || triangle.size() == 0 || triangle.get(0).get(0) == null) return 0;
        // size + 1 是为了不用初始化最后一行
        // answer中记录了求第i行时，第i+1的最小路径和
        int[] answer = new int[triangle.size() + 1];
        // 使用自底向上的方法，new 数组的时候就进行了初始化
        // 转换方程 answer[j] = Math.min(answer[j],answer[j + 1]) + list.get(j)
        // 即每一行都选出当前路径的最小值，到answer[0]的时候就会是所有的最小值
        for (int i = triangle.size() - 1; i >= 0;i --){
            List<Integer> list = triangle.get(i);
            for (int j = list.size() - 1; j >= 0; j --)
                answer[j] = Math.min(answer[j],answer[j + 1]) + list.get(j);
        }
        return answer[0];
    }
}
