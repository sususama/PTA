package LeetCode.OneToFiveHundred;

import LeetCode.TreeNode;

public class OneHundredAndFour {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else {
            // 直接进行递归，找到左右中最大的返回
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left,right) + 1;
        }
    }
}
