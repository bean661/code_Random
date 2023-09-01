package codeRandom.chapter06.part04;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-28 15:30
 **/
public class code07 {
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

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null) {
            return null;
        }

        return buildHelper(inorder, 0, inorder.length, postorder, 0, postorder.length);


    }

    private TreeNode buildHelper(int[] inorder, int l1, int r1, int[] postorder, int l2, int r2) {
        if (l1 == r1) {
            return null;
        }

        int rootVal = postorder[r2 - 1];
        TreeNode root = new TreeNode(rootVal);
        int middleIndex;
        for (middleIndex = l1; middleIndex < r1; middleIndex++) {
            if (inorder[middleIndex] == rootVal) {
                break;
            }
        }

        root.left = buildHelper(inorder, l1, middleIndex, postorder, l2, l2 + middleIndex - l1);
        root.right = buildHelper(inorder, middleIndex + 1, r1, postorder, l2 + middleIndex - l1, r2 - 1);

        return root;
    }
}
