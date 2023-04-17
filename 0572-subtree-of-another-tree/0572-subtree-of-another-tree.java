/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        /* BFS */
        while(!q.isEmpty()) {
            TreeNode tn = q.poll();

            if(isSame(tn,subRoot)) return true;
            if(tn.left != null) q.add(tn.left);
            if(tn.right != null) q.add(tn.right);
        }
        return false;
    }
    
    /* 하위 노드까지 같은지 확인 */
    public boolean isSame(TreeNode a, TreeNode b) {
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        
        if(a.val != b.val) return false;
        else return isSame(a.left,b.left) && isSame(a.right,b.right); 
    }
}