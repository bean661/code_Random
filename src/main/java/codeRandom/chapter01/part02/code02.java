package codeRandom.chapter01.part02;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 11:27
 **/
public class code02 {


    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                minlen = Math.min(minlen, j - i + 1);
                sum -= nums[i++];
            }
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;

    }
    /**
     * 滑动窗口的思想
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen2(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int minlen = Integer.MAX_VALUE;
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();
        while (j < nums.length) {
            queue.add(nums[j]);
            sum += nums[j];
            if (sum >= target) {
                minlen = Math.min(minlen, j - i + 1);
                while (sum >= target) {
                    sum -= queue.peek();
                    queue.poll();
                    i++;
                    if (sum >= target) {
                        minlen = Math.min(minlen, j - i + 1);
                    }
                }
            }
            j++;
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}
