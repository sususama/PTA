package study;

public class MergeSort {
    // 归并排序
    public int[] mergeSort(int[] nums, int[] ans, int start, int end){
        if (start >= end) return null;
        int len = end - start, mid = (start + end)/2;
        // 将其分为两部分，确定两部分的边界
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        // 进行递归，先将其分散，然后将分散之后进行排序
        mergeSort(nums, ans, start1, end1);
        mergeSort(nums, ans, start2, end2);
        // 开始进行排序
        int k = start;
        // 将分散的两个部分进行排序，放在 ans 中
        while (start1 <= end1 && start2 <= end2)
            ans[k++] = nums[start1] < nums[start2] ? nums[start1++] : nums[start2++];
        // 如果还有剩余的数，将其放入
        while (start1 <= end1)
            ans[k++] = nums[start1++];
        // 同上
        while (start2 <= end2)
            ans[k++] = nums[start2++];
        // 将排序好的数字放入 nums 中
        for (k = start; k <= end; k++)
            nums[k] = ans[k];
        return nums;
    }
}
