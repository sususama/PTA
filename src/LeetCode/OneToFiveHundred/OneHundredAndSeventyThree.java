package LeetCode.OneToFiveHundred;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class OneHundredAndSeventyThree {
    private List<Integer> list = new ArrayList<>();
    private int index = 0;
    public OneHundredAndSeventyThree(TreeNode root) {
        // 是一个二叉搜索树，每次要找出最小值进行输出，我们可以直接进行中序遍历
        // 然后将遍历结果存入list中
        helper(root);
    }
    private void helper(TreeNode treeNode){
        // 将root按照大小顺序放入list中，然后进行遍历
        if (treeNode == null) return;
        helper(treeNode.left);
        list.add(treeNode.val);
        helper(treeNode.right);
    }
    /** @return the next smallest number */
    public int next() {
        return list.get(index++);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return index + 1 >= list.size();
    }
}
