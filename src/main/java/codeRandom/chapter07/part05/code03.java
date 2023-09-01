package codeRandom.chapter07.part05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-01 16:15
 **/
public class code03 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        permuteUniqueHelper(nums, used);
        return result;
    }

    private void permuteUniqueHelper(int[] nums, boolean[] used) {
        if (path.size() >= nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //同层 相等数字
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            // 同支
            if (used[i] == false) {
                used[i]  = true;
                path.add(nums[i]);
                permuteUniqueHelper(nums, used);
                path.remove(path.size() - 1);
                used[i] = false;
            }

        }


    }


}
