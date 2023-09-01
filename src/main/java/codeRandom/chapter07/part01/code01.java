package codeRandom.chapter07.part01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-30 21:14
 **/
public class code01 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> paths = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        combineHelper(n, k, 1);
        return result;
    }

    void combineHelper(int n, int k, int start) {
        if (paths.size() == k) {
            result.add(new ArrayList<>(paths));
            return;
        }

        for (int i = start; i <= n - (k-paths.size()) + 1; i++) {
            paths.add(i);
            combineHelper(n, k, i+1);
            paths.remove(paths.size() - 1);
        }

    }

}
