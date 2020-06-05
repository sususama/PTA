package LeetCode.OneToFiveHundred;

import java.util.ArrayList;
import java.util.List;

public class FiftyFour {
    public List<Integer> spiralOrder(int[][] matrix) {
        // 螺旋矩阵，可以进行循环，当每次循环完成之后，将上下左右边界缩减
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0] == null) return list;
        // 定义上下左右边界
        int top = 0, low = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (true){
            // 从左到右
            for (int i = left; i <= right; i ++) list.add(matrix[top][i]);
            if (++ top > low) break;// 缩减上边界
            // 从上到下
            for (int i = top; i <= low; i++) list.add(matrix[i][right]);
            if (-- right < left) break;// 缩减右边界
            // 从右到左
            for (int i = right; i >= left; i--) list.add(matrix[low][i]);
            if (-- low < top) break;// 缩减下边界
            // 从下到上
            for (int i = low; i >= top; i--) list.add(matrix[i][left]);
            if (++ left > right) break;// 缩减左边界
        }
        return list;
    }
}
