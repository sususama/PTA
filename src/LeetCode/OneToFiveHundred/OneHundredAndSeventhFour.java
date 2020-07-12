package LeetCode.OneToFiveHundred;

public class OneHundredAndSeventhFour {
    // 记忆每次计算之后最小值
    int[][] memo;
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length, n = dungeon[0].length;
        memo = new int[m][n];
        return dfs(dungeon, m, n, 0, 0);
    }
    // 我们只需要计算每次向下走或者向右走需要的最小的血量，除了在边界的时候
    private int dfs(int[][] dungeon,int m,int n,int i,int j){
        // 终止条件
        if (i == m - 1 && j == n - 1) return Math.max(1 - dungeon[i][j], 1);
        // 如果这块已经计算过了，直接跳过
        if (memo[i][j] > 0) return memo[i][j];
        // 当在边界的时候
        int min = 0;
        if (i == m - 1)
            min = Math.max(dfs(dungeon, m, n, i, j + 1) - dungeon[i][j],1);
        else if (j == n - 1)
            min = Math.max(dfs(dungeon, m, n, i + 1, j) - dungeon[i][j],1);
        // 要考虑血量最低为 1,并且必定是第一格开始，所以第一格需要的血量是必须要的
        // 然后计算后面所有的路径的需要的最小的生命值
        else min = Math.max(
                Math.min(dfs(dungeon, m, n, i + 1, j),dfs(dungeon, m, n, i, j + 1)) - dungeon[i][j]
                ,1);
        return memo[i][j] = min;
    }
}
