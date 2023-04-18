/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node idx = root;
        /* 수직으로 이동 */
        while(idx != null) {
            /* 가짜 시작 지점 */
            Node tmp = new Node(0);
            Node curr = tmp;
            /* 수평으로 이동 */
            while(idx != null) {
                /* 수평으로 이동하면서 idx의 child단 next의 null 확보 */
                if(idx.left != null) {curr.next = idx.left; curr = curr.next;}
                if(idx.right != null) {curr.next = idx.right; curr = curr.next;}
                idx = idx.next; // idx를 수평으로 옮겨서 형제 노드 또한 작업해준다.
            }
            /* idx를 자식 노드단으로 내린다 */
            idx = tmp.next;
        }
        return root;
    }
}