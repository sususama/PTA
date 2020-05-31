package LeetCode.剑指offer;

public class MaxValue {
    public int maxValue(int[][] grid) {
        // 这是一道很明显的dp问题，我们可以对整个数组进行遍历
        // 如果是当右为空，就只加上，若下为空就只加右，若均不为空就比较两个数的最大值
        int len = grid.length;
        if (len == 0) return 0;
        int len1 = grid[0].length;
        if (len1 == 0) return 0;
        for (int i = 0; i < len; i++){
            for (int j = 0; j <len1; j++){
                if (i - 1 < 0 && j - 1 < 0) continue;// 在边界的时候直接跳过
                if (i - 1 < 0) grid[i][j] += grid[i][j - 1];// 当行在最左边的时候，直接加为右边
                else if (j - 1 < 0) grid[i][j] += grid[i - 1][j];// 和上面相同
                else grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);// 当均不为空，比较两个大小，加上大的
            }
        }
        return grid[len - 1][len1 - 1];
    }
}
