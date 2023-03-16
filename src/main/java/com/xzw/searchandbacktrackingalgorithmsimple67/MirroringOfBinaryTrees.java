package com.xzw.searchandbacktrackingalgorithmsimple67;

/**
 * @author maroon
 * @date 2023/3/16 14:51
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 */
public class MirroringOfBinaryTrees {
}
class Solution10 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temNode = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temNode);
        return root;
    }
}