package LeetCode.OneToFiveHundred;

import LeetCode.Node;

import java.util.HashMap;

public class OneHundredAndThirtyEight {
    HashMap<Node, Node> map = new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head == null)return null;
        // 如果已经有当前节点我们就不需要进行对这个节点的拷贝,直接返回当前节点
        if (map.containsKey(head)) return map.get(head);
        // 我们进行的是两个方向的遍历，所以我们用当前节点 head 做 answer 节点的 key
        Node answer = new Node(head.val);
        // 存入节点
        map.put(head,answer);
        // 对两个方向的节点进行遍历
        answer.next = copyRandomList(head.next);
        answer.random = copyRandomList(head.random);
        return answer;
    }
}
