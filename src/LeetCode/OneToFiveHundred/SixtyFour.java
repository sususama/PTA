package LeetCode.OneToFiveHundred;

public class SixtyFour {
    // 记忆答案
    private int[][] ans;
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        ans = new int[m][n];
        // 进行搜索
        return dfs(grid, m, n, 0, 0);
    }
    // 用 ans 记录每次走过每个位置的时候的最小值
    private int dfs(int[][] grid, int m, int n, int i, int j){
        // 到达终点
        if (i == m - 1 && j == n - 1) return grid[i][j];
        // 记忆，如果已经算过了，直接跳过
        if (ans[i][j] > 0) return ans[i][j];
        // 当两边某一边到边界之后，就向另一个方向前进
        int min = Integer.MAX_VALUE;
        if (i == m - 1)
            min = dfs(grid, m, n, i, j + 1) + grid[i][j];
        else if (j == n - 1)
            min = dfs(grid, m, n, i + 1, j) + grid[i][j];
        else// 如果没到边界，就计算走哪步最小
            min = Math.min(dfs(grid, m, n, i + 1, j), dfs(grid, m, n, i, j + 1)) + grid[i][j];
        // 进行记录
        return ans[i][j] = min;
    }
}
