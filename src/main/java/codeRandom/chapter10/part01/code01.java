package codeRandom.chapter10.part01;

import java.util.Stack;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-07 17:06
 **/
public class code01 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        stack.push(0);
        for (int i = 1; i <temperatures.length ; i++) {
            if (temperatures[i] <= temperatures[stack.peek()]) {
                stack.push(i);
            }else {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int topIndex = stack.peek();
                    result[topIndex] = i-topIndex;
                    stack.pop();
                }
            }
            stack.push(i);
        }
        return result;
    }
}
