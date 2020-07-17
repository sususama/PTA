package LeetCode.OneToFiveHundred;

import java.util.Arrays;

public class ThirtyFive {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return 0;
        // 可以进行查找，如果有的话，直接就返回能节省时间
        int temp = Arrays.binarySearch(nums, target);
        if (temp >= 0)
            return temp;
        // 进行二分查找
        int left = 0, right = len - 1, ans = len;
        while (left <= right){// 先决条件
            int mid = ((right - left) >> 1) + left;// 防止除法出错，就使用位运算
            if (target <= nums[mid]){// 如果小于等于的话将右指针指向中线的左边
                ans = mid;
                right = mid - 1;
            }else// 与上相反
                left = mid + 1;
        }
        return ans;
    }
}
