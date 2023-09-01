package codeRandom.chapter07.part01;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-30 22:20
 **/
public class code02 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        combinationSum(k, n, 1,0);
        return result;
    }

    void combinationSum(int k, int n, int start,int sum) {
        if (sum > n) {
            return;
        }
        if (path.size() == k) {
            if (sum == n) result.add(new ArrayList<>(path));
            return;
        }


        for (int i = start; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            combinationSum(k, n, i + 1, sum += i);
            path.remove(path.size() - 1);
            sum -= i;
        }
    }
}
