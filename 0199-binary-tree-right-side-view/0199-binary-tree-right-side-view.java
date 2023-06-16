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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        bfs(root, result, 0);

        return result;
    }
    
    public void bfs(TreeNode curr, List<Integer> result, int depth) {
        if(curr == null) return;
        if(depth == result.size()) result.add(curr.val);

        bfs(curr.right, result, depth+1);
        bfs(curr.left, result, depth+1);
    }
}