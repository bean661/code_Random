package codeRandom.chapter07.part03;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-01 11:37
 **/
public class code03 {
    List<List<String>> result = new ArrayList<>();
    Deque<String> deque = new LinkedList<>();
    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return result;
    }

    private void backTracking(String s, int startIndex) {
        if (startIndex >= s.length()) {
            result.add(new ArrayList<>(deque));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isPalindrome(s, startIndex, i)) {
                String str = s.substring(startIndex, i + 1);
                deque.addLast(str);

            }else {
                continue;
            }

            backTracking(s, i+1);
            deque.removeLast();
        }
    }

    private boolean isPalindrome(String s, int startIndex, int end) {
        for (int i  = startIndex,j = end; i < j; i++,j--){
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }


}
