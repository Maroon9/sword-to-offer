package com.xzw.lookupalgorithmmedium5.searchandbacktrackingalgorithmmedium141518;

/**
 * @author maroon
 * @date 2023/3/30 18:33
 * 输入一棵二叉树的根节点，求该树的深度。
 * 从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class DepthOfABinaryTree {
}
class Solution6 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}