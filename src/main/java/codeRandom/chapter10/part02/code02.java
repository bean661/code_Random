package codeRandom.chapter10.part02;

import java.util.Map;
import java.util.Stack;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-07 19:35
 **/
public class code02 {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int result =0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] < height[stack.peek()]) {
                stack.push(i);
            } else if (height[i] == height[stack.peek()]) {
                stack.pop();
                stack.push(i);
            }else {
                while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                    int mid = stack.pop();
                    if (!stack.isEmpty()) {
                        int h = Math.min(height[i], height[stack.peek()])-height[mid];
                        result += (i-stack.peek()-1) * h;
                    }

                }
                stack.push(i);
            }
        }
        return result;
    }
}
