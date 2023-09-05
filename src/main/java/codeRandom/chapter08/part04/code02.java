package codeRandom.chapter08.part04;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 17:00
 **/
public class code02 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return b[0] - a[0];
        });
        LinkedList<int[]> que = new LinkedList<>();
        for (int[] person : people) {
            que.add(person[1], person);
        }

        return que.toArray(new int[people.length][]);
    }
}


