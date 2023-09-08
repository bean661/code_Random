package codeRandom.chapter09.part09;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-08 15:45
 **/
public class code01 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}
