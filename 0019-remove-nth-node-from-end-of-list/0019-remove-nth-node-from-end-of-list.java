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
        ListNode end = head;

        int len = 0;
        while(end!=null){
            end = end.next;
            len++;
        }
        if(n==len){
            return head.next;
        }
        
        ListNode temp = head;
        for(int i=0;i<len-1-n;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}