package com.xzw.lookupalgorithmmedium5.searchandbacktrackingalgorithmmedium141518;

/**
 * @author maroon
 * @date 2023/3/23 17:34
 */
public class TheKthLargestNodeOfABinarySearchTree {
}
class Solution5 {
    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        if (k == 0) return;
        if (--k == 0) res = root.val;
        dfs(root.left);
    }
}