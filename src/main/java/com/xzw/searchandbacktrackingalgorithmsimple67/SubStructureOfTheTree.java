package com.xzw.searchandbacktrackingalgorithmsimple67;

/**
 * @author maroon
 * @date 2023/3/15 16:53
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 *
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 */
public class SubStructureOfTheTree {
}
class Solution8 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null) return false;
        return search(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
    private boolean search(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null) return false;
        return A.val == B.val && search(A.left, B.left) && search(A.right, B.right);
    }
}
class Solution9 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        //0.题目约定空树不是子树
        if(B==null){return false;}
        return search(A,B);
    }
    private boolean compare(TreeNode A, TreeNode B){
        if(B == null){
            //5.A不一定要为空，因为B是A的子树，比如[1]是[1,3]的子树
            return true;
        }
        if(A == null){
            //6.A为空，B不为空必然不是子树
            return false;
        }
        //7.判断当前节点相不相等，左右子树相不相等
        return A.val == B.val && compare(A.left,B.left) && compare(A.right,B.right);
    }
    //1.先序遍历找到A中B的根节点位置
    private boolean search(TreeNode A, TreeNode B){
        //2.和先序打印二叉树一样，终止条件是节点为空
        if(A == null){
            //优化方案，这里可以写到isSubStructure里去:if(A == null || B == null) return false;
            return false;
        }
        //3.在先序打印二叉树里我们会在这里打印节点的值
        //4.在本题中我们比较该节点的值是否和B根节点相同，如果相同再判断是子树不是相同结构
        if(A.val == B.val && compare(A,B)){
            return true;
            //优化方案:这里的比较值其实与compare()里的比较是重复的
            //优化方案:所以可以合并下面那句写成compare(A,B) || search(A.left,B) || search(A.right,B);
        }
        //遍历左子树，遍历右子树
        return search(A.left,B) || search(A.right,B);
    }
}