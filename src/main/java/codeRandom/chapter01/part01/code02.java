package codeRandom.chapter01.part01;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 10:57
 **/
public class code02 {


    /**
     * 快慢指针
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == val) {
                j++;
            }else {
                nums[i++] = nums[j++];
            }
        }
        return i;
    }
}
