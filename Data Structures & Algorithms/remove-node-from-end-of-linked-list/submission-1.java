/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       // brute force: iterate the linkedlist once -> # of nodes,
       // and we find second from the end by doing total-n
       ListNode dummy = new ListNode(0, head);
       ListNode p1 = head;
       for (int i = 0; i < n; i++) {
        p1 = p1.next;
       } 
       ListNode p2 = dummy;
       while (p1 != null) {
        p1 = p1.next;
        p2 = p2.next;
       }
       p2.next = p2.next.next;
       return dummy.next;
    }
}
