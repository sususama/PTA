package LeetCode.OneToFiveHundred;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class OneHundredAndFourteen {
    private List<TreeNode> ans = new ArrayList<>();
    public void flatten(TreeNode root) {
        // 将所有的跟存贮在 ans 中，记录进入的顺序
        helper(root);
        int len = ans.size();
        // 进行循环，造树
        for (int i = 1; i < len; i++){
            // 由例题我们可以知道每个根的左子树为 null， 右子树为进入树的顺序的下一个
            TreeNode temp = ans.get(i - 1), next = ans.get(i);
            temp.left = null;
            temp.right = next;
        }
    }
    private void helper(TreeNode root){
        if (root != null){
            // 根据观察例题，我们可以知道，每次都是先进左子树，没有左子树再进右子树
            // 逐个进入
            ans.add(root);
            helper(root.left);
            helper(root.right);
        }
    }
}
