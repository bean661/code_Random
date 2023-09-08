package codeRandom.chapter09.part08;

import java.util.HashSet;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-08 15:31
 **/
public class code01 {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length() ; i++) {
            for (int j = 0; j < i && !dp[i]; j++) {
                if (set.contains(s.substring(j, i)) && dp[j]) {
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
