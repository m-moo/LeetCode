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
        ListNode rs = new ListNode();
        ListNode next = new ListNode();
        int plus = 0;
        while(true){
            if(l1 == null && l2 == null){
                if(plus>0){
                    next = next.next;
                    next.val = plus;
                }else{
                    next.next = null;
                }
                break;
            }

            int num1 = 0, num2 = 0;
            if(l1!=null){
                num1 = l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                num2 = l2.val;
                l2 = l2.next;
            }

            int sum = num1+num2+plus;
            if(sum >= 10){
                 plus = 1;
                 sum-=10;
            }else{
                plus = 0;
            }

            if(rs.next == null){
                rs.val = sum;
                rs.next = next;
                next = rs;
            }else{
                next = next.next;
                next.val = sum;
                next.next = new ListNode();
            }
        } 
        return rs;
    }
}