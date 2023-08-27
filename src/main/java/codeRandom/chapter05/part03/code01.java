package codeRandom.chapter05.part03;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 15:32
 **/
public class code01 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            // 弹出不在范围的值
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            //2.既然是单调，就是要放进去的数字要比末尾的都大，否则也弹出
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            //
            deque.offer(i);
            //因为单调，当i增长到符合第一个范围的时候，每滑动一步都将队列节点放入结果
            if (i >= k - 1) {
                res[idx++] = nums[deque.peek()];
            }

        }
        return res;
    }
}
