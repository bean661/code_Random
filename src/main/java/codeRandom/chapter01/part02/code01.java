package codeRandom.chapter01.part02;

import java.util.Arrays;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 11:12
 **/
public class code01 {

    /**
     * 双指针问题 new一个新数组存放
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int[] newA = new int[nums.length];
        int k= newA.length-1;
        int i = 0;
        int j = nums.length - 1;
        while (j >= i) {
            if (nums[j] * nums[j] >= nums[i] * nums[i]) {
                newA[k] = nums[j] * nums[j];
                j--;
                k--;
            }else {
                newA[k] = nums[i] * nums[i];
                i++;
                k--;
            }
        }
        return newA;
    }
}
