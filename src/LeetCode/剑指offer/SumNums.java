package LeetCode.剑指offer;

public class SumNums {
    // 递归
    public int sumNums(int n) {
        // 在没有递归到 n = 1的时候是不会回溯
        // 所以这里直接用n进行计数
        boolean x = n > 1 && (n += sumNums(n -1)) > 0;
        return n;
    }
}
    