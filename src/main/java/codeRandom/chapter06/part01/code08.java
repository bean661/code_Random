package codeRandom.chapter06.part01;

import java.util.*;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 21:50
 **/
public class code08 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            int max = Integer.MIN_VALUE;
            int total = len;
            while (len > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                max = Math.max(max, node.val);
                len--;
            }
            ans.add(max);
        }
        return ans;
    }
}
