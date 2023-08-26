package codeRandom.chapter03.part02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 23:39
 **/
public class code04 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0 && nums[i] > target) {
                return result;
            }

            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (j> i + 1 && nums[j - 1] == nums[j]) {
                    continue;
                }
                int left = j+1;
                int right = nums.length-1;
                while (left < right) {
                    long sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    }else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (right > left && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (right > left && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }


        }
        return result;
    }
}
