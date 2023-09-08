package codeRandom.chapter09.part07;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-07 21:36
 **/
public class code01 {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        int m =2;
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i >= j) {
                    dp[i] += dp[i-j];
                }
            }
        }
        return dp[n];
    }
}
