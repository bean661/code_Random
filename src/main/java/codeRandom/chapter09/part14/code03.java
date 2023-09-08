package codeRandom.chapter09.part14;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-07 11:07
 **/
public class code03 {
    public static void main(String[] args) {
        int[] nums = {-1,-2};
        maxSubArray(nums);
    }
    public static  int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int result = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            result = Math.max(result, dp[i]);
        }
//        for (int i : dp) {
//            System.out.println(i);
//        }
        return  result;
    }
}
