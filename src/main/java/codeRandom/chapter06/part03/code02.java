package codeRandom.chapter06.part03;

import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-28 11:18
 **/
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class code02 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node child : root.children) {
            max = Math.max(max,maxDepth(child));
        }
        return max+1;
    }
}


