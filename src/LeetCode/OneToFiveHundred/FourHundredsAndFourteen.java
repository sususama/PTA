package LeetCode.OneToFiveHundred;

public class FourHundredsAndFourteen {
    public String addStrings(String num1, String num2) {
        // 用 StringBuffer 方便操作
        StringBuffer sb = new StringBuffer("");
        // 用双指针，根据加法法则，我们从后往前加，从 carry 来保存进位
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        //用空间换时间
        char[] nums1 = num1.toCharArray(), nums2 = num2.toCharArray();
        while (i >= 0 || j >= 0){
            // 只有当前数组还有内容才能进行计算， - ‘0’ 是为了计算出当前的数字，用 ASCII 码，下同
            int n1 = i >= 0 ? nums1[i] - '0' : 0;
            int n2 = j >= 0 ? nums2[j] - '0' : 0;
            // 当前位数等于两位相加加进位
            int temp = n1 + n2 + carry;
            // 给字符串里添加结果，数字只能是 0 - 9 ，所以用 10 进行算余
            sb.append(temp % 10);
            // 进位计算
            carry = temp / 10;
            // 移动指针
            i--;j--;
        }
        // 如果最后也进位了，就要算上去
        if (carry == 1) sb.append(1);
        // 反向进入的，最后要反转
        return sb.reverse().toString();
    }
}
