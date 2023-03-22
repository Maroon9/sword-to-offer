package com.xzw.doublepointersimple111213;

/**
 * @author maroon
 * @date 2023/3/19 15:48
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 */
public class DeletingNodesOfAChainTable {
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode node = head;
        ListNode pre = null;
        if(node.val == val) return head.next;
        while (node.val != val) {
            pre = node;
            node = node.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}