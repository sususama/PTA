package study;

public class QuickSort {
    // 快速排序
    public int[] quickSort(int[] nums, int left,int right){
        if (left < right){
            // 前提条件
            int start = left, end = right, temp = nums[start];// 存贮作为比较的数字
            while (start < end){
                // 右往左寻找第一个小于temp的数字，并将其与 nums[start] 交换
                while (start < end && nums[end] >= temp)
                    end--;
                if (start < end) nums[start++] = nums[end];
                // 同上，从左往右寻找第一个大于 temp 的数字，找到之后将其与 nums[end]进行交换
                while (start < end && nums[start] < temp)
                    start++;
                if (start < end) nums[end--] = nums[start];
            }
            // 将存储的最初始倍变更的数放进去
            nums[start] = temp;
            quickSort(nums, left, start);
            quickSort(nums, start + 1, right);
        }
        return nums;
    }
}
