package codeRandom.chapter06.part01;

import java.util.ArrayDeque;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 23:00
 **/
public class code11 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            int len = deque.size();
            while (len > 0) {
                TreeNode node = deque.poll();
                swap(node);
                if (node.left != null) deque.add(node.left);
                if (node.right != null) deque.add(node.right);
                len--;
            }

        }
        return root;

    }
    public TreeNode invertTree1(TreeNode root) {
        if (root == null) {
            return root;
        }
        swap(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    void swap(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
