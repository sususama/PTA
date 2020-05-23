package LeetCode.剑指offer;

import java.util.PriorityQueue;
import java.util.Queue;

public class Fourth {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0){
            return new int[0];
        }
        // 使用一个最大堆（大顶堆）
        // Java 的 PriorityQueue 默认是小顶堆，添加 comparator 参数使其变成最大堆
        Queue<Integer> queue = new PriorityQueue<>(k, (i1,i2) -> Integer.compare(i1,i2));

        //入堆
        for (int a : arr){
            //当前数字小于堆元素才会入堆
            if (queue.isEmpty() || queue.size() < k || a < queue.peek())
                queue.offer(a);
            if (queue.size() > k)
                queue.poll();
        }

        //将堆中元素加到数组中
        int [] sum = new int[k];
        int j = 0;
        for (int i : queue){
            sum[j++] = i;
        }
        return sum;
    }
}
