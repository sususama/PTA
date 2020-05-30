package LeetCode.剑指offer;

import java.util.ArrayDeque;

public class MaxSlidingWindow {
    int[] nums;
    ArrayDeque<Integer> deq = new ArrayDeque<>();
    private void clean_deque(int i ,int k){
        // 清理双向列表
        // 只保留当前滑块内的数组, 并且将当前滑块内的数字存放在队列首
        // 当双向队列不为空并且队列的第一个数字是上个滑块的最后一个数字
        if (!deq.isEmpty() && deq.getFirst() == i - k)
            // 将第一个数字移除
            deq.removeFirst();

        // 移除队列中所有小于当前的数字的数，即保留当前框内的最大值
        while (!deq.isEmpty() && nums[i] > nums[deq.getLast()])
            deq.removeLast();
    }
    // 滑动窗口的最大值
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if (len == 0) return new int[0];
        if (k == 1)return nums;
        this.nums = nums;
        int max_idx = 0;
        int sum[] = new int[len - k + 1];
        for (int i = 0; i < k; i++){
            clean_deque(i,k);
            deq.addLast(i);
            if (nums[i] > nums[max_idx])
                max_idx = i;
        }
        sum[0] = nums[max_idx];

        for (int i = k; i < len; i++){
            clean_deque(i,k);
            deq.addLast(i);
            sum[i - k + 1] = nums[deq.getFirst()];
        }
        return sum;
    }
}
