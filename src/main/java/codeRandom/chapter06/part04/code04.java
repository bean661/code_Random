package codeRandom.chapter06.part04;


/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-28 13:50
 **/
public class code04 {
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
    private int Deep = -1;
    private int value = 0;
    public int findBottomLeftValue(TreeNode root) {
        value = root.val;
        findLeftValue(root,0);
        return value;

    }

    void findLeftValue(TreeNode node, int deep) {
        if (node == null) {
            return;
        }
        if (Deep < deep) {
            Deep = deep;
            value = node.val;
        }
        if (node.left != null) {
            findLeftValue(node.left, deep + 1);
        }
        if (node.right != null) {
            findLeftValue(node.right,deep +1);
        }
    }



}
