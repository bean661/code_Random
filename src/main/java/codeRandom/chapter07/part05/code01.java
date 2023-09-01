package codeRandom.chapter07.part05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-01 14:58
 **/
public class code01 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> paths = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        findSubsequencesHelper(nums, 0,Integer.MIN_VALUE);
        return result;
    }

    private void findSubsequencesHelper(int[] nums, int start,int pre) {

        if (paths.size() >= 2) {
            result.add(new ArrayList<>(paths));
        }
        if (start >= nums.length) {
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (nums[i] >= pre &&  !set.contains(nums[i])) {
                set.add(nums[i]);
                paths.add(nums[i]);
                findSubsequencesHelper(nums, i + 1, nums[i]);
                paths.remove(paths.size() - 1);
            } else {
                continue;
            }
        }

    }
}
