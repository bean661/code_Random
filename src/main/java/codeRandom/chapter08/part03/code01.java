package codeRandom.chapter08.part03;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-01 23:48
 **/
public class code01 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums)
                .boxed()
                .sorted((o1,o2) -> Math.abs(o2) - Math.abs(o1))
                .mapToInt(Integer::intValue).toArray();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        if (k % 2 == 1) {
            nums[len - 1] = -nums[len - 1];
        }
        return Arrays.stream(nums).sum();
    }
}
