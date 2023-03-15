package com.xzw.stacksandqueues1;

import java.util.LinkedList;

/**
 * @author maroon
 * @date 2023/3/9 15:28
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
 */
public class StackContainingMinFunctions {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

    }
}

class MinStack {
    LinkedList<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            return -1;
        }

    }

    public int min() {
        if (!stack.isEmpty()) {
            return Math.min(stack.pop(), stack.pop());
        } else {
            return -1;
        }

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */