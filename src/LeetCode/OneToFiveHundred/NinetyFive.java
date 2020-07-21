package LeetCode.OneToFiveHundred;

import LeetCode.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class NinetyFive {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new LinkedList<TreeNode>();
        return generateTrees(1,n);
    }
    private List<TreeNode> generateTrees(int start, int end){
        List<TreeNode> ans = new LinkedList<>();
        // 前提条件
        if (start > end){
            ans.add(null);
            return ans;
        }
        for (int i = start; i <= end; i++){
            // 找到左边的所有的可能
            List<TreeNode> left = generateTrees(start,i - 1);
            // 同上
            List<TreeNode> right = generateTrees(i + 1, end);
            // 将左右两边的树进行拼接，找到所有可能的树
            for (TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode temp = new TreeNode(i, l,r);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
