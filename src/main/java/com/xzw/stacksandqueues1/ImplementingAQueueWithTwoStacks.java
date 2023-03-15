package com.xzw.stacksandqueues1;

import java.util.LinkedList;

/**
 * @author maroon
 * @date 2023/3/9 15:27
 *
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 */
public class ImplementingAQueueWithTwoStacks {
    public static void main(String[] args) {
        CQueue queue = new CQueue();
        queue.appendTail(3);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }
}
class CQueue {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;
    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        if (stack1.isEmpty()) return -1;
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */