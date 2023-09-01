package codeRandom.chapter06.part03;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-28 12:10
 **/
public class code04 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftDepth = 0; int rightDepth = 0;
        while (left != null) {
            left = left.left;
            leftDepth++;
        }
        while (right != null) {
            right = right.right;
            rightDepth++;
        }
        if (leftDepth == rightDepth) {
            return (2<<leftDepth)-1;
        }
        leftDepth = countNodes(root.left);
        rightDepth = countNodes(root.right);
        return leftDepth + rightDepth + 1;

    }
    public int countNodes1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left + right + 1;

    }
}
