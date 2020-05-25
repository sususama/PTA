package LeetCode.剑指offer;

import LeetCode.ListNode;

public class GetKthFromEnd {
        public ListNode getKthFromEnd(ListNode head, int k) {
            int len = 0;
            ListNode temp = head;
            while (temp != null){
                len++;
                temp = temp.next;
            }
            if (len == 0) return null;
            for (int i = 0; i <= len; i++){
                if (i == len - k)
                    break;
                head = head.next;

            }
            return head;
        }
}
