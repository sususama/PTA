package LeetCode.剑指offer;

public class Exchange {
    public int[] exchange(int[] nums) {
        int len = nums.length;
        int[] number = new int[len];
        //直接使用双指针，对数组进行遍历
        int left = 0;
        int right = len - 1;
        for (int num : nums){
            if (num % 2 == 0) //偶数
                number[right--] = num;
            else //奇数
                number[left++] = num;
        }
        return number;
    }
}
