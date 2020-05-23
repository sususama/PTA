package LeetCode.面试题;

import LeetCode.TreeNode;

public class ConvertBiNode {
    public TreeNode convertBiNode(TreeNode root) {
        if (root == null)
            return null;
        // 中序遍历
        TreeNode sub = convertBiNode(root.left);
        // 若为空则说明遍历完了，就直接将sub指向root
        if (sub == null)
            sub = root;
        else {
            // 记录头节点
            TreeNode temp = sub;
            // 找到链表队尾
            while (sub.right != null)
                sub = sub.right;
            // 将当前节点放入队尾
            sub.right = root;
            sub = temp;
        }
        // 所有的左子树均置空
        root.left = null;
        root.right = convertBiNode(root.right);
        return sub;
    }
}
