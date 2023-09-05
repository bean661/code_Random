package codeRandom.chapter08.part02;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 19:31
 **/
public class code03 {
    public int jump(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int count = 0;
        int curDistance = 0;
        int maxDistance = 0;
        for (int i = 0; i < nums.length; i++) {
            maxDistance = Math.max(i+nums[i], maxDistance);
            if (maxDistance >= nums.length - 1) {
                count++;
                break;
            }

            if (curDistance == i) {
                curDistance = maxDistance;
                count++;
            }
        }
        return count;
    }
}
