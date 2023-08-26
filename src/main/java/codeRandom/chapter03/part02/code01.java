package codeRandom.chapter03.part02;

import java.util.HashMap;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 22:32
 **/
public class code01 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                if (!hashMap.containsKey(sum)) {
                    hashMap.put(sum, 1);
                }else {
                    hashMap.put(sum, hashMap.get(sum) + 1);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int sum = nums3[i] + nums4[j];
                if (hashMap.containsKey(0 - sum)) {
                    count += hashMap.get(0 - sum);
                }
            }
        }
        return count;
    }
}
