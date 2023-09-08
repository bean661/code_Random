package codeRandom.chapter09.part09;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-08 17:06
 **/
public class code03 {
    public class TreeNode {
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

    public int rob(TreeNode root) {
        int[] res = rob1(root);
        return Math.max(res[0], res[1]);
    }
    // 3.状态标记递归
    // 执行用时：0 ms , 在所有 Java 提交中击败了 100% 的用户
    // 不偷：Max(左孩子不偷，左孩子偷) + Max(又孩子不偷，右孩子偷)
    // root[0] = Math.max(rob(root.left)[0], rob(root.left)[1]) +
    // Math.max(rob(root.right)[0], rob(root.right)[1])
    // 偷：左孩子不偷+ 右孩子不偷 + 当前节点偷
    private int[] rob1(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = rob1(root.left);
        int[] right = rob1(root.right);

        int[] res = new int[2];
        // 不偷 偷
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = left[0]+ right[0] + root.val;
        return res;

    }
}
