package codeRandom.chapter08.part03;

import java.util.Arrays;
import java.util.Map;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 16:26
 **/
public class code03 {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] candyVec = new int[len];
        candyVec[0] = 1;
        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candyVec[i] = candyVec[i - 1] + 1;
            }else {
                candyVec[i] = 1;
            }
        }

        for (int i = len-2; i >= 0 ; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candyVec[i] = Math.max(candyVec[i], candyVec[i + 1] + 1);
            }
        }
        return Arrays.stream(candyVec).sum();
    }
}
