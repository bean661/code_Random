package codeRandom.chapter09.part05;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-06 12:20
 **/
public class code02 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (target < 0 && sum < -target) {
            return 0;
        }
        if ((target + sum) % 2 != 0) {
            return 0;
        }
        int size = (target + sum)/2;
        int[] dp = new int[size + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = size; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[size];
    }
}
