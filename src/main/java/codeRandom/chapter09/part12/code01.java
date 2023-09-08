package codeRandom.chapter09.part12;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-06 18:32
 **/
public class code01 {
    public int maxProfit(int[] prices) {
        int[] dp = new int[4];
        // 0 持股 1 保持卖出 2卖出股 3冷冻期
        dp[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            int temp = dp[0];
            int temp1 = dp[2];
            dp[0] = Math.max(dp[0], Math.max(dp[3], dp[1]) - prices[i]);
            dp[1] = Math.max(dp[1], dp[3]);
            dp[2] = temp + prices[i];
            dp[3] = temp1;
        }
        return Math.max(dp[1], Math.max(dp[2], dp[3]));
    }
}
