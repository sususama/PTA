package LeetCode.面试题;

public class FindMagicIndex {
    public int findMagicIndex(int[] nums) {
        return helper(nums,0,nums.length - 1);
    }
    private int helper(int[] nums, int left, int right){
        // 前提条件
        if (left > right) return -1;
        // 防止计算机出发计算错误
        int mid = (right - left) / 2 + left;
        // 进行遍历，寻找左边的可能的答案，因为在左边，只要找到的话就比右边的大，所以直接进行返回
        int leftAns = helper(nums, left, mid - 1);
        if (leftAns != -1)
            return leftAns;
        // 相等，直接符合条件，进行返回
        else if (nums[mid] == mid)
            return mid;
        // 如果走过上面的还没有找到，就肯定在右边了，直接进行返回
        return helper(nums, mid + 1, right);
    }
}
