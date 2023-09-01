package codeRandom.chapter07.part02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-30 22:42
 **/
public class code01 {
    List<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    HashMap<Integer, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return result;
        }
        map.put(2,"abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        letterCombinationsHelper(digits, 0);
        return result;
    }

    void letterCombinationsHelper(String digits, int start) {
        if (sb.length() == digits.length()) {
            result.add(sb.toString());
            return;
        }
        for (int i = start; i < digits.length(); i++) {
            int num = digits.charAt(i)-'0';
            String s = map.get(num);
            char[] chars1 = s.toCharArray();
            for (char c : chars1) {
                sb.append(c);
                letterCombinationsHelper(digits, i + 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }

    }
}
