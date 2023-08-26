package codeRandom.chapter03.part01;

import java.util.Arrays;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 21:41
 **/
public class code02 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length <= 0 || nums2.length <= 0) {
            return new int[0];
        }
        int[] arr = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            arr[nums1[i]] = 1;
        }
        int count = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (arr[nums2[i]] == 1) {
                count++;
                arr[nums2[i]] = 2;
            }
        }
        int[] res = new int[count];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                res[j++] = i;
            }
        }
        return res;
    }
}
