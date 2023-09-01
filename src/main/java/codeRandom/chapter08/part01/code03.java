package codeRandom.chapter08.part01;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-01 23:35
 **/
public class code03 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int sum = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            sum = Math.max(sum, count);
            if (count <= 0) {
                count = 0;
            }
        }
        return sum;
    }
}
