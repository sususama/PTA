package LeetCode.OneToFiveHundred;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fifteen {
    public List<List<Integer>> threeSum(int[] nums) {
        // 这道题，我们要判度三数之和是否为0，我们可以对数组进行排序，对数组进行遍历
        // 设定两个指针，分别指向当前下标的右侧和数组尾部，当数组的当前下标加上左右下标为0，就将其记录
        List<List<Integer>> answer = new ArrayList<>();
        int len = nums.length;
        // 如果满足下面条件，就说明不可能有三个数
        if (len < 3 || nums == null) return answer;
        // 排序
        Arrays.sort(nums);
        // 进行遍历
        for (int i = 0; i < len; i++){
            // 若当前下标大于0，后面就不可能凑到和为 0 的数组
            if (nums[i] > 0) break;
            if(i > 0 && nums[i - 1] == nums[i]) continue;// 去重
            int left = i + 1;
            int right = len - 1;
            while ( left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    // 进行记录
                    answer.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    // 去重
                    while ( left < right && nums[left] == nums[left + 1]) left++;
                    while ( left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }else if (sum > 0) right--;// 若 sum 大于 0 就说明当前数太大了，应该将右指针向左移动
                else if (sum < 0)left++;// 与上面相反
            }
        }
        return answer;
    }
}
