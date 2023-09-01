package codeRandom.chapter06.part03;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-28 11:32
 **/
public class code03 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (root.right == null && root.left != null) {
            return l+1;
        } else if (root.right != null && root.left == null) {
            return r+1;
        }else {
            return Math.min(l,r)+1;
        }

    }

}
