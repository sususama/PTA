package LeetCode.other;

public class QuickSort {
    public void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;
        // 找到基准元
        int index = partition(arr, startIndex, endIndex);
        // 对左半边进行排序
        quickSort(arr, startIndex, index - 1);
        // 对右半边进行排序
        quickSort(arr, index + 1, endIndex);
    }
    // 找基准元，并对其左右进行排序
    private int partition(int[] arr, int startIndex, int endIndex){
        // 设第一个元素为基准元，当然也可以随机取start到end中的一个元素作为基准元
        int pivot = arr[startIndex];
        // 运用双指针进行排序
        int left = startIndex;
        int right = endIndex;
        // 坑的位置，初始等于pivot的位置
        int index = startIndex;
        //大循环在左右指针重合或者交错时结束
        while ( right >= left ){
        //right指针从右向左进行比较
            while ( right >= left ) {
                // 当右边的数小于pivot时将它和左边的数相替换，并且把左指针向右移一位
                // 这时相当于被移动的数的位置是空的，我们需要用index记录下来，并直接跳出循环
                if (arr[right] < pivot) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                // 当当前下标的数比pivot大时，将右指针向左边移动一位
                right--;
            }
        //left指针从左向右进行比较
            while ( right >= left ) {
                //道理同上，刚好相反
                if (arr[left] > pivot) {
                    arr[right] = arr[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        arr[index] = pivot;
        return index;
    }
}
