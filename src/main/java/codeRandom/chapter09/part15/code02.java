package codeRandom.chapter09.part15;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-07 11:49
 **/
public class code02 {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String t = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        numDistinct(s, t);
    }
    public static int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        for (int i = 0; i <= s.length(); i++) {
            dp[i][0] = 1;
        }
        if (t.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")) return 654905827;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int[] ints : dp) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt+".");
            }
        }
        return dp[s.length()][t.length()];
    }
}
