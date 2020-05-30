package LeetCode.剑指offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {
    Queue<Integer> que;
    Deque<Integer> deq;
    public MaxQueue() {
        que = new LinkedList<>();  //队列：插入和删除
        deq = new LinkedList<>();  //双端队列：获取最大值
    }

    public int max_value() {
        return deq.size() > 0 ? deq.peekFirst() : -1;//当双端队列中有最大值时输出
    }

    public void push_back(int value) {
        que.offer(value);
        while (deq.size() > 0 && deq.peekLast() < value)
            deq.removeLast();//删除队尾小于当前value的值
        deq.offerLast(value);
    }

    public int pop_front() {
        int num = que.size() > 0 ? que.poll() : -1;
        while (deq.size() > 0 && num == deq.peek())//如果当前输出的是最大值，就把deq的当前最大值删除
            deq.pollFirst();
        return num;
    }
}
