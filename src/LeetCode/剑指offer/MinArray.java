package LeetCode.剑指offer;

public class MinArray {
    public int minArray(int[] numbers) {
        int start = 0, end = numbers.length - 1;
        while (start < end){
            // 防止除法运算出错
            int mid = (end - start) / 2 + start;
            // 如果 mid 大于 end 就说明已经找的反转点了，在 mid 和 end 中间，进行循环寻找
            if (numbers[mid] > numbers[end]) start = mid + 1;
            // 若小于，则可能没找到反转点，在 start 到 mid 中寻找
            else if (numbers[mid] < numbers[end]) end = mid;
            else end--;
        }
        return numbers[start];
    }
}
