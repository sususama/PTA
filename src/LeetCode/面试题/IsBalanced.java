package LeetCode.面试题;

import LeetCode.TreeNode;

public class IsBalanced {
    private boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        depth(root);
        return flag;
    }
    private int depth(TreeNode treeNode){
        if (!flag || treeNode == null) return 0;// 结束递归判断
        // 统计左右的最大深度
        int left = depth(treeNode.left);
        int right = depth(treeNode.right);
        // 判断深度相差是否大于1，即是否平衡
        if (Math.abs(left - right) > 1) {
            flag = false;
            return 0;
        }
        return Math.max(left, right) + 1;// 判断的是大深度，如果判断到这则说明该节点是平衡的，就将其最大深度向上统计
    }
}
