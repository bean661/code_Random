package codeRandom.chapter07.part05;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-01 16:04
 **/
public class code02 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> paths = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        permuteHelper(nums, used);
        return result;
    }

    private void permuteHelper(int[] nums, boolean[] used) {
        if (paths.size() >= nums.length) {
            result.add(new ArrayList<>(paths));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            paths.add(nums[i]);
            permuteHelper(nums, used);
            used[i] = false;
            paths.remove(paths.size() - 1);
        }


    }
}
