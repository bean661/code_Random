package codeRandom.chapter08.part02;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 18:04
 **/
public class code01 {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            res += Math.max(0, prices[i] - prices[i - 1]);
        }
        return res;
    }
}
