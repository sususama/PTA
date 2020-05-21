package LeetCode.剑指offer;

import java.util.Stack;

public class CQueue {
    // 用两个栈来构建队列
    Stack<Integer> stack1;
    Stack <Integer> stack2;
    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    // 队尾插入，队头删除
    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        // 当第二个链表为空的时候直接返回栈顶数
        if (!stack2.isEmpty()) return stack2.pop();
        // 当第一个链表为空的时候说明没有数，直接返回-1
        if (stack1.isEmpty()) return -1;
        // 将第一个栈的内容倒入第二个栈中，方便进行删除操作
        while (! stack1.isEmpty()){
            stack2.add(stack1.pop());
        }
        return stack2.pop();
    }
}
