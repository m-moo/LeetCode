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
    public int maxDepth(TreeNode root) {
        List<Integer> findMaxDepth = new ArrayList<>();
        bfs(root,findMaxDepth,0);

        return findMaxDepth.size();
    }

    public void bfs(TreeNode curr, List<Integer> findMaxDepth, int depth) {
        if(curr == null) return;
        if(findMaxDepth.size() == depth) findMaxDepth.add(curr.val);

        bfs(curr.right, findMaxDepth, depth+1);
        bfs(curr.left, findMaxDepth, depth+1);
    }
}