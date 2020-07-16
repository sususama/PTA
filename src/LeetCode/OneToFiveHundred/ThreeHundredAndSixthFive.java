package LeetCode.OneToFiveHundred;

public class ThreeHundredAndSixthFive {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) return false;
        if (z == 0 || x + y == z) return true;
        return z % (x = y == 0 ? gcd(y, x): gcd(x, y)) == 0;

    }
    private int gcd(int x, int y){
        return x % y == 0 ? y : gcd(y, x % y);
    }
}
