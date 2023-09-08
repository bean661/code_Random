package codeRandom.chapter09.part04;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-06 10:46
 **/
public class code01 {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        int[] dp = new int[target + 1];

        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
            if (dp[target] == target) {
                return true;
            }
        }
        return dp[target] == target;
    }
}
