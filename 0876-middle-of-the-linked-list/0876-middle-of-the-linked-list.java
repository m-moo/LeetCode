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
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;
        while(end.next!=null){
            middle = middle.next;
            if(end.next.next == null){
                end = end.next;
            }
            else
                end = end.next.next;
        }
        return middle;
    }
}