package codeRandom.chapter06.part04;


import java.util.ArrayList;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-28 13:50
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        List<Integer> paths = new ArrayList<>();
        traversal(root, paths, res);
        return res;
    }

    void traversal(TreeNode node, List<Integer> paths, List<String> res) {
        paths.add(node.val);
        if (node.left == null && node.right == null) {
            //输出
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < paths.size() - 1; i++) {
                stringBuilder.append(paths.get(i) + "->");
            }
            stringBuilder.append(paths.get(paths.size() - 1));
            res.add(stringBuilder.toString());
            return;
        }

        if (node.left != null) {
            traversal(node.left, paths, res);
            paths.remove(paths.size() - 1);
        }

        if (node.right != null) {
            traversal(node.right, paths, res);
            paths.remove(paths.size() - 1);
        }






    }
}
