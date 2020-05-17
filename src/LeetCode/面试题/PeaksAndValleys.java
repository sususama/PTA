package LeetCode.面试题;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PeaksAndValleys {
    public void wiggleSort(int[] nums) {
        //思路：我们可以将数组进行排序，然后依次取出相对的最大值和最小值
        int idx = 0, len = nums.length;
        if (len < 3) return;
        int low = 0, high = len - 1;
        //复制原数组进行排序
        int[] sorted = Arrays.copyOf(nums, len);
        Arrays.sort(sorted);
        //依次取出相对最大和最小值放入数组
        while (low < high) {
            nums[idx++] = sorted[high--];
            nums[idx++] = sorted[low++];
        }
        // 当数组为奇数时，就会剩下最后一个中间的，将其放入数组
        if (len % 2 > 0)
            nums[idx] = sorted[low];
/*        int i = 0, len = nums.length;
        if (len < 3) return;
        int half = len >> 1, idx = 0;
        int[] copy_nums = Arrays.copyOf(nums, len);
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        for (; i < half; ++i)
            min_heap.offer(copy_nums[i]);
        for (; i < len; ++i) {
            min_heap.offer(copy_nums[i]);
            nums[idx] = min_heap.poll();
            idx += 2;
        }
        idx = 1;
        for (int num : min_heap) {
            nums[idx] = num;
            idx += 2;
        }*/
        
    }
}
