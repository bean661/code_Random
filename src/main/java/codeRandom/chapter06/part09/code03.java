package codeRandom.chapter06.part09;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-30 20:15
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
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        convertBST1(root);
        return root;
    }

    void convertBST1(TreeNode root) {
        if (root == null) {
            return;
        }

        convertBST1(root.right);
        root.val = root.val+sum;

        sum = root.val;

        convertBST1(root.left);


    }

}
