package codeRandom.chapter07.part04;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-01 14:44
 **/
public class code02 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> paths = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subsetsHelper(nums, 0);
        return result;
    }

    private void subsetsHelper(int[] nums, int start) {
        result.add(new ArrayList<>(paths));
        if (start >= nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            paths.add(nums[i]);
            subsetsHelper(nums, i + 1);
            paths.remove(paths.size() - 1);
        }

    }


}
