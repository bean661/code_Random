package codeRandom.chapter05.part02;

import java.util.Stack;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 14:27
 **/
public class code01 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '{') {
                stack.push('}');
            } else if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.peek() != ch) {
                return false;
            }else {
                stack.pop();
            }
        }
    return stack.isEmpty();
    }

}
