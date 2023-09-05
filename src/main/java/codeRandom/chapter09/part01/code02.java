package codeRandom.chapter09.part01;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 22:04
 **/
public class code02 {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];

        if (n <= 2) {
            return n;
        }
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n ; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
