package codeRandom.chapter09.part06;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-06 14:44
 **/
public class code01 {
    public static void main(String[] args) {
        int amount  = 5;
        int[] coins = new int[]{1, 2, 5};
        change(amount,coins);
        change2(amount,coins);
    }
    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0]= 1;

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
            for (int i1 : dp) {
                System.out.print(i1);
            }
            System.out.println();
        }

        return dp[amount];
    }

    public static int change2(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0]= 1;
        for (int j = 0; j <= amount; j++) { // 遍历背包容量
            for (int i = 0; i < coins.length; i++) { // 遍历物品
                if (j - coins[i] >= 0) dp[j] += dp[j - coins[i]];
            }
            for (int i1 : dp) {
                System.out.print(i1);
            }
            System.out.println();
        }
        return dp[amount];
    }
}
