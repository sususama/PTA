package LeetCode.OneToFiveHundred;

public class FiftyThree {
//
//        public int crossSum(int [] nums, int left, int right, int p) {
//            //判断数组长度是否为一
//            if (left == right)
//                return nums[left];
//            //计算左半部分的最大和
//            int leftMax = Integer.MIN_VALUE;
//            int temp = 0;
//            // p 是中间位
//            for (int i = p; i > left - 1; i--){
//                temp += nums[i];
//                leftMax = Math.max(leftMax,temp);
//            }
//            int rightMax = Integer.MIN_VALUE;
//            temp = 0;
//            for (int i = p + 1 ; i < right + 1; i++){
//                temp += nums[i];
//                rightMax = Math.max(rightMax, temp);
//            }
//            return leftMax + rightMax;
//        }
//
//        public int helper(int [] nums, int left, int right){
//            // 添加递归终止判断
//            if (left == right)
//                return nums[left];
//            //进行递归调用，将问题划分
//            int p = (left + right)/2;
//            int leftMax = helper(nums, left, p);
//            int rightMax = helper(nums, p + 1, right);
//            int tempMax = crossSum(nums, left, right, p);
//            return Math.max(Math.max(leftMax,rightMax), tempMax);
//        }
//
//        public int maxSubArray(int[] nums) {
//            return helper(nums, 0, nums.length - 1);
//        }
    public int maxSubArray(int[] nums) {
        //ans存储最大值，sum只管往后加，变成负数就不继续加了，转而指向下一个数，然后重复同样的步骤往后加
        int ans = nums[0];
        int sum = 0;
        for (int num : nums){
            if (sum > 0)
                sum += num;
            else
                sum = num;
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
