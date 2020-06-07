package LeetCode.OneToFiveHundred;

import LeetCode.TreeNode;

public class FourHundredAndThirtySeven {
    private int helper(TreeNode root, int sum){
        if (root == null) return 0;
        sum -= root.val;
        return (sum == 0 ? 1 : 0) + helper(root.left, sum) + helper(root.right, sum);
    }
    public int pathSum(TreeNode root, int sum) {
        // 只能是从父节点到子节点
        // 可以从节点挨个进行遍历
        if (root == null) return 0;
        // 将每个节点都传入helper函数中
        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
}
