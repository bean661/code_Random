package codeRandom.chapter01.part01;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-20 11:48
 **/
public class code01 {


    // 二分 左闭右开
    public int search(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target ){
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                return mid;
            }

        }
        return -1;
    }
    // 左闭 又闭
    public int search2(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }else if (nums[mid] == target) {
                return mid;
            }

        }
        return -1;
    }
}