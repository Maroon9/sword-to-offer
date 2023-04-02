package com.xzw.searchandbacktrackingalgorithmmedium141518;

/**
 * @author maroon
 * @date 2023/3/30 18:42
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，
 * 那么它就是一棵平衡二叉树。
 */
public class BalancedBinaryTrees {
}
class Solution8 {
    public boolean isBalanced(TreeNode root) {
        return search(root) != -1;
    }
    private int search(TreeNode root) {
        if (root == null) return 0;
        int left = search(root.left);
        if (left == -1) return -1;
        int right = search(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}