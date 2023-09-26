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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> history1 = new ArrayList<>();
        dfs(root1, history1);
        List<Integer> history2 = new ArrayList<>();
        dfs(root2, history2);

        return history1.equals(history2);
    }

    public void dfs(TreeNode node, List<Integer> history) {
        if(node.left == null && node.right == null) {
            history.add(node.val);
            return;
        }

        if(node.left != null) dfs(node.left, history);
        if(node.right != null) dfs(node.right, history);
    }
}