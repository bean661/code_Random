package codeRandom.chapter08.part02;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 18:40
 **/
public class code02 {
    public boolean canJump(int[] nums) {
        if (nums[0] == 0 && nums.length == 1) {
            return true;
        }
        else if (nums[0] == 0) {
            return false;
        }
        int res = nums[0];
        int location = 0;
        for (int i = 1; i < nums.length; i++) {
            location = i;
            res = Math.max(res - 1, nums[i]);
            if (res == 0) {
                break;
            }
        }
        if (location == nums.length - 1) {
            return true;
        }
        return false;
    }
}
