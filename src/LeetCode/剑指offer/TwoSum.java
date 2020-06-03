package LeetCode.剑指offer;

public class TwoSum {
    public double [] twoSum(int n){
//        double chance = Math.pow(0.16667, n);
//        int mid = (6 * n - 1) / 2;
//        double [] sum = new double[6 * n - 1];
//        for (int i = 1; i <= mid+1; i++){
//            sum [i-1] = i * chance;
//        }
//        for (int i = 1; i < mid; i++){
//            sum[mid+i] = sum[mid - i];
//        }
//        return sum;
//        if (n == 1) {
//            double [] a ={0.16667, 0.16667, 0.16667, 0.16667, 0.16667, 0.16667};
//            return a;
//        }
        int [][] temp = new int[n + 1][6 * n + 1];//防止溢出
        //进行边界处理
        for (int i = 1;i <= 6; i++)temp[1][i] = 1;
        //统计每个出现的次数
        for (int i = 2;i <= n;i++){//i是第i个骰子
            for (int j = i;j <= 6 * i;j++){//j表示点数
                //状态转移方程
                for (int k = 1;k <= 6;k++){
                    //要防止溢出
                    if (j - k < i - 1) break;
                    temp[i][j] += temp[i-1][j - k];
                }
            }
        }
        double all = Math.pow(6,n);
        double [] sum = new double[5 * n + 1];
        // 最终进行计算概率
        for (int i = n; i <= n*6; i++){
            sum[i - n] = (temp[n][i])/all;
        }
        return sum;
    }
}
