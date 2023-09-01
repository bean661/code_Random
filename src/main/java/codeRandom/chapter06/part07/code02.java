package codeRandom.chapter06.part07;

import jdk.nashorn.internal.runtime.PrototypeObject;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-30 12:32
 **/
public class code02 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    ArrayList<Integer> resList;
    int maxCount;
    int count;
    TreeNode pre;

    public int[] findMode(TreeNode root) {
        resList = new ArrayList<>();
        maxCount = 0;
        count = 0;
        pre = null;
        findMode1(root);
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

    void findMode1(TreeNode node) {
        if (node == null) {
            return;
        }

        findMode1(node.left);
        int nodeValue = node.val;
        if (pre == null || pre.val != nodeValue) {
            count = 1;
        }else {
            count++;
        }

        if (count > maxCount) {
            resList.clear();
            resList.add(nodeValue);
            maxCount = count;
        } else if (count == maxCount) {
            resList.add(nodeValue);
        }
        pre = node;

        findMode1(node.right);
    }





}
