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
        /* 처음부터 연속되는 경우가 있으므로 범위 외의 가짜 시작지점을 만들어준다 */
        ListNode fake = new ListNode(101,head);
        ListNode left = fake;
        ListNode right = head;
        
        while(right != null) {
            /* 우포인터를 연속이 끝나는 지점까지 이동 */
            while(right.next != null && right.val == right.next.val) {
                right = right.next;
            }
            if(left.next == right) left = left.next; // 우포인터가 움직이지 않았으면 좌포인터를 전진
            else left.next = right.next; // 우포인터가 움직였다면 좌포인터 노드와 우포인터 다음 노드를 잇는다
            right = right.next; //우포인터를 다음 노드로 움직인다
        }
        
        /* 진짜 시작지점을 반환 */
        return fake.next;
    }
}