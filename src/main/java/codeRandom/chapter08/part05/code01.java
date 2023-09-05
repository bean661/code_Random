package codeRandom.chapter08.part05;

import java.util.Arrays;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 19:52
 **/
public class code01 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return a[0] - b[0];});
        int count = 1;
        for (int i = 1; i <intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
                continue;

            }else {
                count++;
            }

        }
        return intervals.length-count;
    }
}
