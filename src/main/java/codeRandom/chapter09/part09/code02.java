package codeRandom.chapter09.part09;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-08 16:47
 **/
public class code02 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(rob2(nums, 0, nums.length - 2), rob2(nums, 1, nums.length - 1));
    }

    public int rob2(int[] nums,int start , int end) {
        if (start == end) {
            return nums[start];
        }
        int[] dp = new int[nums.length];

        dp[start] = nums[start];
        dp[start+1] = Math.max(nums[start], nums[start+1]);
        for (int i = start+2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[end];
    }
}
