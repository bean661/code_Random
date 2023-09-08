package codeRandom.chapter09.part06;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-06 15:08
 **/
public class code02 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}
