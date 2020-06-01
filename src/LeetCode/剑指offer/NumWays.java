package LeetCode.剑指offer;

public class NumWays {
    public int numWays(int n) {
        int a = 1, b = 1, temp;
        for (int i = 0; i < n; i++){
            temp = (a + b) % 1000000007;
            b = a;
            a = temp;
        }
        return b;
    }
}
