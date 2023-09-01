package codeRandom.chapter06.part07;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-30 12:32
 **/
public class code01 {
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
    TreeNode pre;
    int result = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        inOrder(root);
        return result;
    }

    void inOrder(TreeNode node) {
        // 叶节点
        if (node == null) {
            return;
        }
        // 左
        inOrder(node.left);
        // 中
        if (pre != null) {
            result = Math.min(result, node.val - pre.val);
        }

        pre = node;

        // 右
        inOrder(node.right);
        return;


    }

}
