package codeRandom.chapter06.part06;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-28 15:30
 **/
public class code02 {
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

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        TreeNode node;
        if (root1 != null && root2 == null) {
            node = new TreeNode(root1.val);
        } else if (root1 == null && root2 != null) {
            node = new TreeNode(root2.val);
        }else {
            node = new TreeNode(root1.val + root2.val);
        }
        if (root1 == null) {
            node.left = mergeTrees(null, root2.left);
            node.right = mergeTrees(null, root2.right);
        } else if (root2 == null) {
            node.left = mergeTrees(root1.left, null);
            node.right = mergeTrees(root1.right, null);
        }else {
            node.right = mergeTrees(root1.right, root2.right);
            node.left = mergeTrees(root1.left, root2.left);

        }

        return node;
    }

}
