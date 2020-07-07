package LeetCode.OneToFiveHundred;

import LeetCode.TreeNode;

public class OneHundredAndTwelve {
    public boolean hasPathSum(TreeNode root, int sum) {
        // 进行递归搜索
        if (root == null) return false;
        // 特殊情况判断
        if (root.left == null && root.right == null) return sum == root.val;
        // 进行递归
        return hasPathSum(root .right, sum - root.val) || hasPathSum(root.left, sum - root.val);
    }
}
