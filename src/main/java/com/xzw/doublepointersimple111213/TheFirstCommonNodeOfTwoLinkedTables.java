package com.xzw.doublepointersimple111213;

/**
 * @author maroon
 * @date 2023/3/20 17:49
 * 输入两个链表，找出它们的第一个公共节点。
 */
public class TheFirstCommonNodeOfTwoLinkedTables {
}
class Solution4 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 = headA, n2 = headB;
        while (n1 != n2) {
            n1 = n1 != null ? n1.next : headB;
            n2 = n2 != null ? n2.next : headA;
        }
        return n1;
    }
}