package codeRandom.chapter06.part01;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 21:03
 **/
public class code02 {
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
    List<Integer> ans;


    public List<Integer> inorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        inOrder(root);
        return ans;
    }

    void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        ans.add(node.val);
        inOrder(node.right);
        return;
    }



    public List<Integer> postorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        postOrder(root);
        return ans;
    }


    void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        ans.add(node.val);
        return;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        preorderT(root);
        return ans;
    }

    void preorderT(TreeNode node) {
        if (node == null) {
            return;
        }
        ans.add(node.val);
        preorderT(node.left);
        preorderT(node.right);
        return;
    }


}
