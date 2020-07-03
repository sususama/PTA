package LeetCode.OneToFiveHundred;

import LeetCode.TreeNode;

public class OneHundredAndEight {
    public TreeNode sortedArrayToBST(int[] nums) {
        // 平衡二叉树的中序遍历是从小到大的，我们可以反向构造平衡二叉树
        return inverseMiddleOrderTraversal(nums ,0 , nums.length - 1);
    }
    private TreeNode inverseMiddleOrderTraversal(int nums[], int left, int right){
        // 先进行中序遍历，将左子树总设为根节点
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = inverseMiddleOrderTraversal(nums, left, mid - 1);
        root.right = inverseMiddleOrderTraversal(nums, mid + 1, right);
        return root;
    }
}
