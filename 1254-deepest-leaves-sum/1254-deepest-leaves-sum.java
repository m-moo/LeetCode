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
    int maxDepth = 0;
    int answer = 0;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 1);
        return answer;
    }

    public void dfs(TreeNode tree, int depth) {
        if(tree.left == null && tree.right == null) {
            if(maxDepth == depth) {
                answer += tree.val;
            }else if(maxDepth < depth) {
                maxDepth = depth;
                answer = tree.val;
            }
            return;
        }

        if(tree.left != null) dfs(tree.left, depth+1);
        if(tree.right != null) dfs(tree.right, depth+1);
    }
}