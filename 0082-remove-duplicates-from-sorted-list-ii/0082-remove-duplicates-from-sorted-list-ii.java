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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode start = new ListNode(0,head);
        ListNode left = start;
        ListNode right = head;
        while(right != null) {
            while(right.next != null && right.val == right.next.val) {
                right = right.next;
            }
            if(left.next == right) left = left.next;
            else left.next = right.next;
            right = right.next;
        }
        
        return start.next;
    }
}