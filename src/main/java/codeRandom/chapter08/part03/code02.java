package codeRandom.chapter08.part03;

import java.util.Arrays;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 16:17
 **/
public class code02 {
    // 暴力java超时

    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < cost.length; i++) {
            int rest = gas[i] - cost[i];
            int index = (i+1) % cost.length;
            while (rest > 0 && index != i) {
                rest += gas[index] - cost[index];
                index = (index + 1) % cost.length;
            }
            if (rest >= 0 && index == i) {
                return i;
            }
        }
        return -1;

    }

    public int canCompleteCircuit1(int[] gas, int[] cost) {
        int curNum = 0;
        int start  = 0;
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            curNum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (curNum < 0) {
                curNum = 0;
                start = i+1;
            }
        }
        if (total < 0) {
            return -1;
        }
        return start;
    }
}
