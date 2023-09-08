package codeRandom.chapter10.part02;

import java.util.Stack;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-07 18:34
 **/
public class code01 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        stack.push(0);
        for (int i = 1; i <nums.length*2 ; i++) {
            if (nums[i%nums.length] <= nums[stack.peek()]) {
                stack.push(i%nums.length);
            }else {
                while (!stack.isEmpty() && nums[i%nums.length] > nums[stack.peek()]) {
                    int topIndex = stack.peek();
                    result[topIndex] = nums[i%nums.length];
                    stack.pop();
                }
            }
            stack.push(i%nums.length);
        }
        return result;
    }
}
