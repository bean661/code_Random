package codeRandom.chapter08.part05;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 20:20
 **/
public class code02 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int[] age = new int[26];
        for (int i = 0; i < s.length(); i++) {
            age[s.charAt(i)-'a'] =i;
        }
        int left = -1;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            right = Math.max(right, age[s.charAt(i) - 'a']);
            if (i == right) {
                res.add(right - left);
                left = i;
            }

        }
        return res;
    }
}
