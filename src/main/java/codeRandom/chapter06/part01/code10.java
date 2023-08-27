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
public class code10 {
    public int minDepth(TreeNode root) {
        int ans = 0;
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            ans++;
            int len = queue.size();
            while (len > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left == null && node.right == null) {
                    return ans;
                }

                len--;
            }
        }
        return ans;
    }
    }
