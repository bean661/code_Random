package codeRandom.chapter07.part03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-30 23:26
 **/
public class code2 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> paths = new ArrayList<>();

    boolean[] used;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (target == 0) {
            return result;
        }
        used = new boolean[candidates.length];
        Arrays.sort(candidates);
        combinationSumHelper(candidates, target,0);
        return result;
    }

    private void combinationSumHelper(int[] candidates, int target,int start) {
        if (target == 0) {
            result.add(new ArrayList<>(paths));
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            paths.add(candidates[i]);
            combinationSumHelper(candidates, target - candidates[i],i+1);
            used[i] = false;
            paths.remove(paths.size() - 1);
        }

    }
}
