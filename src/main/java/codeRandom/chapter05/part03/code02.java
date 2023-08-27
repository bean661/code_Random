package codeRandom.chapter05.part03;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedTransferQueue;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 17:58
 **/
public class code02 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((pair1, pair2) -> pair2[1] - pair1[1]);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            priorityQueue.add(new int[]{entry.getKey(), entry.getValue()});
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = priorityQueue.poll()[0];
        }
        return ans;
    }
}
