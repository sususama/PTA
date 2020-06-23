package study;

public class QuickSort {
    public int[] quickSort(int[] nums, int left,int right){
        if (left < right){
            //  l < r是前提条件
            int i = left, j = right, temp = nums[left];
            // i 存储当前最左边的下标，j 存储当前最右边的下标，temp 是中转数，将两数替换的中间数,并且是比较数
            while (i < j){
                while (i < j && nums[j] >= temp)// 从右往左找第一个小于temp的数
                    j--;
                if (i < j) nums[i++] = nums[j];
                while (i < j && nums[i] < temp)
                    i++;
                if (i < j) nums[j--] = nums[i];
            }
            nums[i] = temp;
            quickSort(nums,left, i - 1);
            quickSort(nums,i + 1,right);
        }
        return nums;
    }
}
