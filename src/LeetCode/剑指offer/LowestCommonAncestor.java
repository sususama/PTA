package LeetCode.剑指offer;

import LeetCode.TreeNode;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 我们进行后序遍历，找到当q,p在不同的子树中或者左为右的父节点，右为左的父节点，则说明此时的节点是最近公共祖先
        // 这句代码浅显易懂
        if (root == null || root == p || root == q) return root;
        // 进行后序遍历
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 若左右皆为空，则说明左右都没在root下，返回null
        if (left == null && right == null) return null;
        // 若左为空，则说明右边是p或q，将其返回
        if (left == null) return right;
        // 与上面相反
        if (right == null) return left;
        // 若进行到这一步，则说明左右皆不为空，说明此节点就是最近公共祖先
        return root;
    }
}
