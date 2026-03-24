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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode copy = head;
        ListNode ans = head.next;
        ListNode evenHead = ans;
        while (copy != null && copy.next != null && ans != null && ans.next != null) {
            copy.next = ans.next;
            copy = copy.next;
            ans.next = copy.next;
            ans = ans.next;
        }
        copy.next = evenHead;
        return head;
    }
}