package study;

public class Dijkstra {
    public int[] getShortestPaths(int[][] adjMatrix){
        int len = adjMatrix.length;
        // 用于存放顶点 o 到其他顶点的最小距离
        int[] result = new int[len];
        // 表示是否遍历过
        boolean[] used = new boolean[len];
        used[0] = true;
        for (int i = 1; i < len; i++){
            // 在循环中存放 顶点到 i 的最小距离
            int min = Integer.MAX_VALUE;
            int k = 0;
            for (int j = 1; j < len; j++)
                // 寻找没有使用过的点，并且此点到原点的路径小于 min
                if (!used[j] && min > result[j]){
                    min = result[j];
                    // 将点的下标进行记录，方便再外面进行修改
                    k = j;
                }
            used[k] = true;
            for (int j = 1; j < len; j++){
                // 将上面找到的最小路径的点加入到当中来，再找距离最近的点
                // 要找没经过的点
                if (!used[j]){
                    // 首先要确定，adjMatrix 不为空，可以通过
                    // 然后要找到原点到 j 的距离要大于顶点到 k 再到 j 的距离
                    // 或者顶点无法直接到达 j 顶点时，我们就更新 原点到 j 的最小举例
                    if (adjMatrix[i][j] != -1 && (result[j] < min + adjMatrix[i][j] || result[j] == -1))
                        result[j] = min + adjMatrix[i][j];
                }
            }
        }
        return result;
    }
}
