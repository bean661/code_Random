package codeRandom.chapter06.part01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 21:50
 **/
public class code06 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            double sum = 0.0;
            int total = len;
            while (len > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                sum += node.val;
                len--;
            }
            ans.add(sum/ total);
        }
        return ans;
    }
}
