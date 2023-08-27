package codeRandom.chapter06.part01;

import javax.swing.event.ListDataEvent;
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
public class code05 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            while (len > 0) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (len == 1) {
                    ans.add(node.val);
                }
                len--;
            }
        }
        return ans;
    }


}
