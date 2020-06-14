package study;

import java.util.Arrays;

public class TwoChaptersFour {
    public int VenueArrangement(int[] start, int[] end){
        int len = start.length;
        if (start == null || len == 0 || len != end.length) return 0;
        // 进行排序
        Arrays.sort(start);
        Arrays.sort(end);
        // 标记数量和最晚会议结束时间的下标
        int count = 0;
        int last = 0;
        for (int i = 0; i < len; i++){
            // 如果会议开始时间小于结束时间，就说明不需要新的场地，能直接开会
            if (start[i] < end[last])
                count++;
            else// 否则就说明会没开完，还需要新场地
                last++;
        }
        return count;
    }
}
