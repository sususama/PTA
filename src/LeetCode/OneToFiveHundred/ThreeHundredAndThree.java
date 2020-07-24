package LeetCode.OneToFiveHundred;

public class ThreeHundredAndThree {
    private int [] temp;
    public ThreeHundredAndThree(int[] nums) {
        //在初始化的时候将数组的所有的数与各自的和与之前的所有的和进行保存
        //在需要计算i到j的时候我们只需要将新数组j对应的下标减去i对应的下标即可
        //动态规划
        //防止溢出
        temp = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++){
            temp[i + 1] = temp[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        //在新数组种nums[j]的下标就是temp中的[j+1]
        return temp[j+1] - temp[i];
    }
}
