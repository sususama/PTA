package LeetCode.OneToFiveHundred;

import java.util.Arrays;

public class ThreeHundredsAndFifty {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        // 为空的情况
        if (m == 0 || n == 0) return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] ans = new int[Math.min(m,n)];
        int index1 = 0, index2 = 0, index = 0;
        // 进行查找，原理和二分查找相似,如果小就往大找
        while (index1 < m && index2 < n){
            if (nums1[index1] < nums2[index2]) index1++;// 小的数，指针就向右移动
            else if (nums2[index2] < nums1[index1]) index2++;// 同理
            else {// 此时两数相等
                ans[index++] = nums1[index1++];
                index2++;
            }
        }
        // 将有内容的数组直接复制返回
        return Arrays.copyOfRange(ans, 0, index);
    }
}
