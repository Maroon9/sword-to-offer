package com.xzw.searchandbacktrackingalgorithmsimple67;

/**
 * @author maroon
 * @date 2023/3/16 15:19
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 */
public class SymmetricBinaryTrees {
}
class Solution11 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return search(root.left, root.right);
    }
    private boolean search(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        return root1.val == root2.val && search(root1.left, root2.right) &&search(root1.right, root2.left);
    }
}