package codeRandom.chapter06.part07;

import java.util.ArrayList;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-30 12:32
 **/
public class code03 {
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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if (left == null && right != null){
            return right;
        }else if (left != null && right == null) {
            return left;
        } else if (left == null && right == null) {
            return null;
        }

        return root;
    }




}
