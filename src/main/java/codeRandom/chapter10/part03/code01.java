package codeRandom.chapter10.part03;

import java.util.Enumeration;
import java.util.Stack;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-07 21:07
 **/
public class code01 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] newHeights = new int[heights.length + 2];
        newHeights[0] = 0;
        int result = 0;
        for (int i = 1; i < newHeights.length - 1; i++) {
            newHeights[i] = heights[i - 1];
        }
        stack.push(0);
        newHeights[newHeights.length-1] = 0;
        for (int i = 1; i < newHeights.length; i++) {
            if (newHeights[i] > newHeights[stack.peek()]) {
                stack.push(i);
            } else if (newHeights[i] == newHeights[stack.peek()]) {
                stack.pop();
                stack.push(i);
            }else {
                while (!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {
                    int h = newHeights[stack.peek()];
                    stack.pop();
                    int w = i - stack.peek() - 1;
                    result = Math.max(result, w * h);
                }
                stack.push(i);
            }
        }
        return result;
    }
}
