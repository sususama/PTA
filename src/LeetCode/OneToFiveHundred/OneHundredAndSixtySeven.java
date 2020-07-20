package LeetCode.OneToFiveHundred;

public class OneHundredAndSixtySeven {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        if (len == 0) return new int[]{-1, -1};
        for (int i = 0; i < len; i++){
            // 规定左右边界
            int left = i  + 1, right = len - 1;
            while (left <= right){
                // 这么计算是防止出现除法误差
                int mid = (right - left) / 2 + left;
                // 进行二分查找
                if (numbers[mid] == target - numbers[i])
                    return new int[]{i + 1, mid + 1};
                else if (numbers[mid] > target - numbers[i])
                    right = mid - 1;
                else left = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}
