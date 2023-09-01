package codeRandom.chapter07.part04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-01 14:44
 **/
public class code03 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> paths = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
        subsetsHelper(nums, 0);
        return result;
    }


    private void subsetsHelper(int[] nums, int start) {
        result.add(new ArrayList<>(paths));
        if (start >= nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] &&  !used[i-1]) {
                continue;
            }
            paths.add(nums[i]);
            used[i] = true;
            subsetsHelper(nums, i + 1);
            used[i] = false;
            paths.remove(paths.size() - 1);
        }

    }


}
