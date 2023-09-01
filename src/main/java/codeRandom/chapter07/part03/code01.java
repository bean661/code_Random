package codeRandom.chapter07.part03;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-30 23:13
 **/
public class code01 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> paths = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (target == 0) {
            return result;
        }
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
            paths.add(candidates[i]);
            combinationSumHelper(candidates, target - candidates[i],i);
            paths.remove(paths.size() - 1);
        }
        
    }

}
