package codeRandom.chapter05.part02;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 15:21
 **/
public class code03 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop()+stack.pop());
            } else if (s.equals("-")) {
                stack.push(0-stack.pop()+stack.pop());
            } else if (s.equals("/")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            }else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
}
