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
        List<List<Node>> levelNodes = new ArrayList<>();
        bfs(root,levelNodes,0);

        for(List<Node> nodes:levelNodes) {
            for(int i=0;i<nodes.size();i++) {
                Node curr = nodes.get(i);
                Node next = null;
                if(i+1!= nodes.size()) next = nodes.get(i+1);
                curr.next = next;
            }
        }

        return root;
    }

    public void bfs(Node curr, List<List<Node>> levelNodes, int depth) {
        if(curr == null) return;
        if(levelNodes.size() == depth) {
            List<Node> values = new ArrayList<>();
            values.add(curr);
            levelNodes.add(values);
        }else {
            List<Node> values = levelNodes.get(depth);
            values.add(curr);
            levelNodes.set(depth, values);
        }

        bfs(curr.left, levelNodes, depth+1);
        bfs(curr.right, levelNodes, depth+1);
    }
}