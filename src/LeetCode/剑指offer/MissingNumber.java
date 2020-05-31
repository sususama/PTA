package LeetCode.剑指offer;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int[] number = new int[len + 1];
        for (int num : nums)
            number[num]++;
        for (int i = 0;i <= len;i++)
            if (number[i] == 0)return i;
        return 0;
    }
}
