package codeRandom.chapter06.part01;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 23:18
 **/
public class code12 {
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

    boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right != null) {
            return false;
        } else if (left != null && right == null) {
            return false;
        } else if (left == null && right == null) {
            return true;
        } else if (left.val != right.val) {
            return false;
        }
        boolean l = compare(left.left, right.right);
        boolean r = compare(left.right, right.left);
        return l && r;
    }
}
