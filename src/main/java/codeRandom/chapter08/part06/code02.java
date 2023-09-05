package codeRandom.chapter08.part06;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 21:42
 **/
public class code02 {
      public class TreeNode {
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
  int res = 0;
    public int minCameraCover(TreeNode root) {
        if (minCameraCover1(root) == 0) {
            res++;
        }
        return res;
    }

    private int minCameraCover1(TreeNode root) {
        if (root == null) {
            return 2;
        }

        int left = minCameraCover1(root.left);
        int right = minCameraCover1(root.right);

        if (left == 2 && right == 2) {
            return 0;
        }
        if (left == 0 || right == 0) {
            res++;
            return 1;
        }

        if (left == 1 || right == 1) {
            return 2;
        }

        return -1;

    }
}
