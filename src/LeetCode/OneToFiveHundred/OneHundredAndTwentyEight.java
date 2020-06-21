package LeetCode.OneToFiveHundred;

import java.util.HashSet;
import java.util.Set;

public class OneHundredAndTwentyEight {
    public int longestConsecutive(int[] nums) {
        // 我们可以将所有的数字都存到哈希表中，进行判断，当当前数字为 X 的时候，判断 x - 1在不在数组内
        // 如果不在，说明此前没有连续数字，如果在，就跳过，因为可能这个数字后面还有数字
        Set<Integer> set = new HashSet<>();
        // 将所有的数字都存入哈希表中，一方面为了方便查询，一方面可以去重
        for (int num : nums)
            set.add(num);
        // 进行遍历，并进行判断
        int max = 0;
        for (int num : set){
            // 判断是否有 x - 1
            if (!set.contains(num - 1)){
                int temp = 1;
                int number = num;
                // 找到最后一位连续的数字
                while (set.contains(number + 1)){
                    temp++;
                    number++;
                }
                max = Math.max(max,temp);
            }
        }
        return max;
    }

}
