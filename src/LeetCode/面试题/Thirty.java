package LeetCode.面试题;

import java.util.Stack;

public class Thirty {
    Stack<Integer> stack;
    Stack<Integer> min;
    /** initialize your data structure here. */
    //先进后出
    public Thirty() {
        stack = new Stack();
        min = new Stack();
    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty())
            min.push(x);
        else {
            int temp = x > min.peek() ? min.peek() : x;
            min.push(temp);
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return  min.peek();
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