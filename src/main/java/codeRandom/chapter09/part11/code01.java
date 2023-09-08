package codeRandom.chapter09.part11;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-06 17:16
 **/
public class code01 {
    public int maxProfit(int[] prices) {
        int[] dp = new int[5];
        dp[0] = 0;
        dp[1] = -prices[0];
        dp[2] = 0;
        dp[3] = -prices[0];
        dp[4] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[0] = Math.max(dp[0], -prices[i - 1]);
            dp[1] = Math.max(dp[1], dp[0] - prices[i]);
            dp[2] = Math.max(dp[2], dp[1] + prices[i]);
            dp[3] = Math.max(dp[3], dp[2] - prices[i]);
            dp[4] = Math.max(dp[4], dp[3] + prices[i]);
        }
        return Math.max(dp[2], dp[4]);
    }
}
