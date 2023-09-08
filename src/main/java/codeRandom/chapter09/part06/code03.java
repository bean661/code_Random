package codeRandom.chapter09.part06;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-08 15:03
 **/
public class code03 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i*i; j <= n ; j++) {
                dp[j] = Math.min(dp[j], dp[j - i * i]+1);
            }
        }
        return dp[n];
    }
}
