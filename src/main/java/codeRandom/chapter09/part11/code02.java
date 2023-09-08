package codeRandom.chapter09.part11;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-06 18:16
 **/
public class code02 {
    public int maxProfit(int k, int[] prices) {
        int[] dp = new int[2 * k + 1];
        for (int i = 1; i < 2*k+1 ; i+=2) {
            dp[i] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j < 2 * k + 1; j++) {
                //奇数天购买
                if (j % 2 == 1) {
                    dp[j] = Math.max(dp[j], dp[j - 1] - prices[i]);
                }else {
                    // 买入
                    dp[j] = Math.max(dp[j], dp[j - 1] + prices[i]);
                }
            }
        }
        return dp[2 * k];
    }
}
