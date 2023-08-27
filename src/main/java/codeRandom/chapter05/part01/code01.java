package codeRandom.chapter05.part01;

import java.util.Stack;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 14:02
 **/
public class code01 {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public code01() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.pop();
    }

    public int peek() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.peek();
    }

    public boolean empty() {
        if (stackOut.isEmpty() && stackIn.isEmpty()) {
            return true;
        }
        return false;
    }
}
