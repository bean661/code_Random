package codeRandom.chapter09.part07;

import java.util.Arrays;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-07 22:06
 **/
public class code02 {
    public int coinChange(int[] coins, int amount) {
        // dp[j] 凑成j需要最少的硬币数
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount ; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
