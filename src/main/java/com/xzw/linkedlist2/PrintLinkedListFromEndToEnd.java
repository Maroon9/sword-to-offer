package com.xzw.linkedlist2;

/**
 * @author maroon
 * @date 2023/3/11 18:26
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class PrintLinkedListFromEndToEnd {
    public static void main(String[] args) {
        new Solution2();
    }
}
 // Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution2 {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            ++count;
            node = node.next;
        }
        int[] res = new int[count];
        node = head;
        for (int i = count - 1; i >= 0; i--) {
            res[i] = node.val;
            node = node.next;
        }
        return res;
    }
}