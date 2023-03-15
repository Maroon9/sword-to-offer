package com.xzw.linkedlist2;

import java.util.LinkedList;

/**
 * @author maroon
 * @date 2023/3/11 18:39
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class InvertedLinkedList {
    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}