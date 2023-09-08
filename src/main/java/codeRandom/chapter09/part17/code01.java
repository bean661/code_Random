package codeRandom.chapter09.part17;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-07 16:00
 **/
public class code01 {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if ((j - i) <= 1) {
                        dp[i][j] = true;
                        result++;
                    } else if (dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
