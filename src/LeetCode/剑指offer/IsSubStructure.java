package LeetCode.剑指offer;

import LeetCode.TreeNode;

public class IsSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        // 判断B是不是A的子结构
        // 首先遍历A，判断A的每个子节点是否包含B
        // 若树为空则为false
        return (A != null && B != null) && (helper(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
        // helper(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B)
        // 这块是为了 A是否包含B， A的左子树是否包含B，A的右子树是否包含B
    }
    private boolean helper(TreeNode a, TreeNode b){
        // 当此时的b为空则说明b已经完成匹配，越过了叶子节点，所以返回true
        if (b == null) return true;
        // a=null的判断原因与上相同，当a的值与b的值不相等则说明匹配不上，直接返回false
        if (a == null || a.val != b.val) return false;
        // 判断两个子节点的值是否相等
        return helper(a.left,b.left) && helper(a.right,b.right);
    }
}
