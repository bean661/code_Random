package codeRandom.chapter06.part04;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-28 15:30
 **/
public class code06 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return ans;
        }

        List<Integer> paths = new ArrayList<>();
        hasTarget(root, paths, targetSum);
        return ans;
    }

    void hasTarget(TreeNode node, List<Integer> paths, int targetSum) {
        paths.add(node.val);
        if (node.left == null && node.right == null) {
            int sum = 0;
            for (Integer path : paths) {
                sum += path;
            }
            if (targetSum == sum) {
                ans.add(new ArrayList<>(paths));
            }
            return;
        }
        if (node.left != null) {
            hasTarget(node.left, paths, targetSum);
            paths.remove(paths.size() - 1);
        }

        if (node.right != null) {
            hasTarget(node.right, paths, targetSum);
            paths.remove(paths.size() - 1);
        }

    }
}
