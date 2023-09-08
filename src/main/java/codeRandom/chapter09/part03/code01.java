package codeRandom.chapter09.part03;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-06 09:36
 **/
public class code01 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] =1;
        for (int i = 3; i <= n ; i++) {
            for (int j = 1; j <= i - j; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}
