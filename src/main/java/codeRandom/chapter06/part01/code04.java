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
public class code04 {
    List<List<Integer>> resList = new ArrayList<>();




    public List<List<Integer>> levelOrder(TreeNode root) {
//        checkFun01(root, 0);
        if (root == null) {
            return resList;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> item = new ArrayList<>();
            int len = queue.size();

            while (len > 0) {
                TreeNode node = queue.poll();
                item.add(node.val);

                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                len--;
            }
            resList.add(item);
        }

        return resList;
    }




    void checkFun01(TreeNode node, int deep) {
        if (node == null) {
            return;
        }
        deep++;
        if (resList.size() < deep) {
            List<Integer> item = new ArrayList<>();
            resList.add(item);
        }
        resList.get(deep - 1).add(node.val);
        checkFun01(node.left, deep);
        checkFun01(node.right,deep);

    }
}
