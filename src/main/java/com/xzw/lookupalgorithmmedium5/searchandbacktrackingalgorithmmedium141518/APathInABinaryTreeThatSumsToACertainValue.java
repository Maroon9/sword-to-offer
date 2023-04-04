package com.xzw.lookupalgorithmmedium5.searchandbacktrackingalgorithmmedium141518;

import java.util.LinkedList;
import java.util.List;

/**
 * @author maroon
 * @date 2023/3/23 15:16
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 */
public class APathInABinaryTreeThatSumsToACertainValue {
}

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

class Solution3 {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        backtrack(root, target);
        return res;
    }

    private void backtrack(TreeNode root, int target) {
        if (root == null) return;
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(list));
        }
        backtrack(root.left, target);
        backtrack(root.right, target);
        list.removeLast();
    }
}