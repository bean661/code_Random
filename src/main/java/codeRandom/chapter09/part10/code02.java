package codeRandom.chapter09.part10;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-06 16:37
 **/
public class code02 {
    public int maxProfit(int[] prices) {
        int[] dp = new int[2];
        dp[0] = -prices[0];
        dp[1]= 0;
        for (int i = 1; i <= prices.length; i++) {
            dp[0] = Math.max(dp[0], dp[1]-prices[i - 1]);
            dp[1] = Math.max(dp[1], dp[0] + prices[i - 1]);
        }
        return dp[1];
    }
}
