package LeetCode.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test{
//    // 这里我直接使用固定的数字，方便调试
//    public static void main(String[] args) {
//        // 随便写一些数字，只需要注意结束时间不能早于开始时间即可
////        Scanner in = new Scanner(System.in);
////        System.out.println("请输入会议的个数");
////        int n = in.nextInt();
//        int[] start = {4,15,9,32,17};
//        int[] end = {22,35,26,35,40};
//        // 将数组进行排序，方便计算
//        Arrays.sort(start);
//        Arrays.sort(end);
//        // 调用进行 贪心算法 的函数
//        int answer = helper(start,end); // 答案就是answer
//        System.out.println(answer);
//    }
//     // 进行 贪心算法 的函数
//    private static int helper(int[] start,int[] end){
//        // 进行特殊情况的判断
//        if (start.length == 0 || end .length == 0 || start.length != end.length) return 0;
//        // 计数器
//        int count = 0;
//        // 记录结束的最后时间的下标
//        int last = 0;
//        // 进行遍历
//        for (int i = 0; i < start.length;i++)
//            // 若start[i] < end[last] 则说明当在这个会场还没开始的时候，last 下标对应的场次还没结束，就需要一个新的场地
//            if (start[i] < end[last])
//                count++;
//            // 否则，就说明已经结束，不需要新场地了
//            else
//                last++;
//        return count;
//    }
}
