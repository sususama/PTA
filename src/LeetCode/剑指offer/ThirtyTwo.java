package LeetCode.剑指offer;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirtyTwo {
    List<List<Integer>> list;
    public List<List<Integer>> levelOrder(TreeNode root) {
        list = new ArrayList<>();
        if (root == null){
            return list;
        }
        before(root, 0);
        // 将中间那行翻转
        for (int i = 1; i < list.size(); i += 2) {
            Collections.reverse(list.get(i));
        }
        return list;
    }
    // 先序遍历，将其放入list中
    public void before (TreeNode root, int sum){
        if (root == null) {
            return;
        }
        if (list.size() <= sum) {
            list.add(new ArrayList<>());
        }
        list.get(sum).add(root.val);
        before(root.left, sum+1);
        before(root.right, sum+1);
    }
//    public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
}
