package LeetCode.剑指offer;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 一道很明显的BFS题目，直接进行BFS遍历即可
        List<List<Integer>> list = new ArrayList<>();
        // BFS 遍历要用到队列
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null)
            queue.add(root);
        // 当队列不为空时，说明还没有遍历完成
        while (!queue.isEmpty()){
            // 用temp来记录每行的值
            List<Integer> temp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--){
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            list.add(temp);
        }
        return list;
    }
}
