package codeRandom.chapter09.part13;

import java.util.Arrays;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-07 09:31
 **/
public class code03 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                dp[i] = Math.max(dp[i],dp[i-1]+1);
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
