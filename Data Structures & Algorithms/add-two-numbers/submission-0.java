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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int var1;
            int var2;
            if (l1 == null) {
                var1 = 0;
            } else {
                var1 = l1.val;
            }
            if (l2 == null) {
                var2 = 0;
            } else {
                var2 = l2.val;
            }
            int sum = var1 + var2 + carry;
            carry = sum / 10;
            int digit = sum % 10;
            cur.next = new ListNode(digit);
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
}
