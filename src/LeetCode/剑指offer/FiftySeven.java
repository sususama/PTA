package LeetCode.剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FiftySeven {
    public int[][] findContinuousSequence(int target) {
//        //滑动窗口
//        //当和小于target时向右滑动，大于时将左端点向右滑动，等于时记录左右端点之间的数
//        //定义数组
//        List<int []> sum = new ArrayList<>();
//        //定义左边界右边界和滑块内的和
//        int left = 1, right = 1, temp = 0;
//        while (left <= target/2){
//            if (temp < target){
//                //右端点向右滑动
//                temp += right;
//                right++;
//            } else if (temp > target){
//                //左端点向右滑动
//                temp -= left;
//                left++;
//            }else {//此时相等了
//                //记录结果
//                int [] arr = new int[right - left];
//                for (int i = left; i < right; i++){
//                    arr[i - left] = i;
//                }
//                sum.add(arr);
//                //边界向右移动
//                temp -= left;
//                left++;
//            }
//        }
//        return sum.toArray(new int[sum.size()][]);
        List<int[]> result = new ArrayList<>();
        int i = 1;
        while(target>0) {
            target -= i++;
            if(target>0 && target%i == 0) {
                int[] array = new int[i];
                for(int k = target/i, j = 0; k < target/i+i; k++,j++) {
                    array[j] = k;
                }
                result.add(array);
            }
        }
        Collections.reverse(result);
        return result.toArray(new int[0][]);
    }
}
