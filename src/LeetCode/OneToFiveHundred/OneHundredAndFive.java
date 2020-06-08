package LeetCode.OneToFiveHundred;

import LeetCode.TreeNode;

import java.util.HashMap;

public class OneHundredAndFive {
    private int idx = 0;
    private int[] preorder;// 先序
    private int[] inorder;// 中序
    private HashMap<Integer,Integer> map = new HashMap<>();// 用来找到中序遍历中 root 的下标

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 将数据传入
        this.preorder = preorder;
        this.inorder = inorder;
        // 把中序遍历节点的值跟下标对应起来
        int idx = 0;
        for (Integer val : inorder)
            map.put(val, idx++);
        return helper(0,idx);
    }
    private TreeNode helper(int left,int right){
        // 若左右相等则说明遍历完成
        if (left == right) return null;
        // 先在先序遍历中找到当前idx下的root
        int val = preorder[idx];
        idx++;
        // 然后再map中找到对应的值再先序遍历中的下标，并且构建新的TreeNode
        TreeNode tree = new TreeNode(val);
        int index = map.get(val);
        // left到index是左子树，index+1到right是右子树
        tree.left = helper(left, index);
        tree.right = helper(index + 1, right);
        return tree;
    }
}
