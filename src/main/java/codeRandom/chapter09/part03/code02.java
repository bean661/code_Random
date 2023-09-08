package codeRandom.chapter09.part03;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-06 10:25
 **/
public class code02 {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] =1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
