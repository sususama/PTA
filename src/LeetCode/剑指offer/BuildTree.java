package LeetCode.剑指offer;

import LeetCode.TreeNode;

import java.util.HashMap;

public class BuildTree {
    HashMap<Integer, Integer> dic = new HashMap<>();
    int[] po;
    public TreeNode buildTree(int[] preOrder, int[] inorder) {
        if (preOrder.length == 0 || inorder.length == 0) return null;
        po = preOrder;
        for (int i = 0; i < inorder.length; i++)
            dic.put(inorder[i], i);
        return recur(0, 0, inorder.length - 1);
    }
    private TreeNode recur(int root, int left, int right){
        if (left > right) return null;
        //找到根节点
        int i = dic.get(po[root]);
        TreeNode root1 = new TreeNode(po[root]);
        //找到左子树，root+1是因为要找preOrder中下一个节点，左边界就是当前左边界，右边界是当前节点的前一个节点
        root1.left = recur(root + 1 ,left, i -1);
        //找到右子树,root(就是找preOrder中下一个根节点) = 当前节点之后的下一个根节点,左节点就是当前节点的后一个节点，右节点就是当前右节点
        root1.right = recur(root + i - left + 1, i + 1,right);
        return root1;
    }
}
