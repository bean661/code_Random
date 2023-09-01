package codeRandom.chapter06.part06;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-28 15:30
 **/
public class code01 {
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

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null) return null;
        return consHelper(nums, 0, nums.length);
    }

    private TreeNode consHelper(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }
        int maxIdx = l;
        int maxValue = Integer.MIN_VALUE;
        for (int i = l; i < r; i++) {
            if (nums[i] > maxValue) {
                maxIdx = i;
                maxValue = nums[i];
            }
        }
        TreeNode node = new TreeNode(maxValue);
        node.left = consHelper(nums, l, maxIdx);
        node.right = consHelper(nums, maxIdx + 1, r);

        return node;

    }

}
