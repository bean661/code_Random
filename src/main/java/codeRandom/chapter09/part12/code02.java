package codeRandom.chapter09.part12;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-06 19:18
 **/
public class code02 {
    public int maxProfit(int[] prices, int fee) {
        int[] dp = new int[2];
        dp[0] = -prices[0];
        dp[1] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[0] = Math.max(dp[0], dp[1] - prices[i]);
            dp[1] = Math.max(dp[1], dp[0] + prices[i] - fee);
        }
        return dp[1];
    }
}
