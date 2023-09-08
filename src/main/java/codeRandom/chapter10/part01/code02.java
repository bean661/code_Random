package codeRandom.chapter10.part01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-07 17:44
 **/
public class code02 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        stack.push(0);
        for (int i = 1; i <nums2.length ; i++) {
            if (nums2[i] <= nums2[stack.peek()]) {
                stack.push(i);
            }else {
                while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                    int topIndex = stack.peek();
                    if (map.containsKey(nums2[topIndex])) {
                        result[map.get(nums2[topIndex])] = nums2[i];
                    }
                    stack.pop();
                }
            }
            stack.push(i);
        }
        return result;
    }
}
