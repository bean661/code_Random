package codeRandom.chapter06.part04;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-28 15:09
 **/
public class code05 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        List<Integer> paths = new ArrayList<>();
        hasTarget(root, paths,targetSum);
        return flag;
    }

    void hasTarget(TreeNode node, List<Integer> paths, int targetSum) {
        paths.add(node.val);
        if (node.left == null && node.right == null) {
            int sum = 0;
            for (Integer path : paths) {
                sum += path;
            }
            if (targetSum == sum) {
                flag = true;
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

    public boolean hasPathSum1(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        targetSum -= root.val;
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }
        if (root.left != null) {
            boolean temp = hasPathSum(root.left, targetSum);
            if (temp) {
                return true;
            }
        }

        if (root.right != null) {
            boolean temp = hasPathSum(root.right, targetSum);
            if (temp) {
                return true;
            }
        }

        return false;
    }

}
