package LeetCode.剑指offer;

public class TranslateNum {
    public int translateNum(int num) {
        // 这道题我们可以首先把每个下标看成单独的数字进行翻译，然后和它的前一位进行合并
        // 看他们是否合法，即前一位和当前为组合为 10 - 25，如果合法，就将其进行统计，否则就不计数
        String str = String.valueOf(num);
        // 分别代表：最多可以翻译的数量，上一个的最大数量，上上一个最大数量
        int answer = 1,ind = 0,last = 0;
        for (int i = 0; i < str.length(); i++){
            // 进行数组滚动，将所有的下标向右移动
            last = ind;
            ind = answer;
            answer = 0;
            answer+= ind;
            if (i == 0) continue;
            // 进行判断，如果数字合法，就计数
            // 取出上一个数字
            String temp = str.substring(i - 1, i + 1);
            if (temp.compareTo("25") <= 0 && temp.compareTo("10") >= 0)
                answer += last;
        }
        return answer;
    }
}
