package codeRandom.chapter06.part04;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-28 15:30
 **/
public class code08 {
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }
        return buildHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode buildHelper(int[] preorder, int l1, int r1, int[] inorder, int l2, int r2) {
        if (l1 == r1) {
            return null;
        }
        int rootVal = preorder[l1];
        TreeNode root = new TreeNode(rootVal);
        int mid;
        for (mid = l2; mid < r2; mid++) {
            if (inorder[mid] == rootVal) {
                break;
            }
        }
        root.left = buildHelper(preorder, l1 + 1, l1 + 1 + mid - l2, inorder, l2, mid);
        root.right = buildHelper(preorder, l1 + 1 + mid - l2, r1, inorder, mid+1, r2);

        return root;
    }
}
