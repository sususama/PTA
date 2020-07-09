package LeetCode.面试题;

public class DivingBoard {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) return new int[0];
        if (shorter == longer) return new int[]{longer * k};
        // 上面很好解释，一个是不用构建，因为 k 是0，另一个是长短相等，只有一个可能
        // 下面就是进行计算，可能性就是从全部最短开始排，逐个换成长的
        int[] ans = new int[k + 1];
        for (int i = 0; i <= k; i++)
            ans[i] = shorter * (k - i) + longer * i;
        return ans;
    }
}
