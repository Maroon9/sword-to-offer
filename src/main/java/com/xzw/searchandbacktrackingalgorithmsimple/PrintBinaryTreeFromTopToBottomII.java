package com.xzw.searchandbacktrackingalgorithmsimple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author maroon
 * @date 2023/3/14 13:38
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 */
public class PrintBinaryTreeFromTopToBottomII {
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //保存最终结果
        List<List<Integer>> res = new ArrayList<>();
        //保存每层数据
        List<Integer> temp = new ArrayList<>();
        //队列
        Queue<TreeNode> q = new LinkedList<>();
        //加入队列
        q.add(root);
        //使用null作为分层符
        q.add(null);
        //如果队列不为空
        while(!q.isEmpty()){
            //弹出队头节点
            TreeNode n = q.poll();
            //如果是分层符，说明这个分层符已经是最后一个最后一个元素了
            //所以退出循环
            if(n==null){
                break;
            }
            //如果不是分层符而是结点则添加它的值
            temp.add(n.val);
            //如果该节点左子节点不为空，则将其进队列
            if(n.left!=null){
                q.add(n.left);
            }
            //如果该结点右子节点不为空，则将其进队列
            if(n.right!=null){
                q.add(n.right);
            }
            //如果队列不为空且队头元素为空，则说明这层遍历完毕了
            //（至于为什么要判断队列是否为空，是因为队列为空时q.peek()得到的值也为null）
            if(!q.isEmpty()&&q.peek()==null){
                //将该层数据添加到结果中
                res.add(temp);
                //重置保存新一轮数据的集合
                temp = new ArrayList<>();
                //将队头的poll弹出
                q.poll();
                //在队尾加上null分层符，此时null前面的元素就属于一层的了
                q.add(null);
            }
        }
        //返回结果
        return res;
    }
}