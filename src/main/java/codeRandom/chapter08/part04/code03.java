package codeRandom.chapter08.part04;

import java.util.Arrays;
import java.util.Map;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 17:58
 **/
public class code03 {
    public int findMinArrowShots(int[][] points) {
        if (points.length <= 0) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> Integer.compare(a[0],b[0]));
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1]) {
                count++;
            }else {
                points[i][1] = Math.min(points[i][1], points[i - 1][1]);
            }
        }
        return count;
    }
}
