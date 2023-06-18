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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> levelValue = new ArrayList<>();
        bfs(root,levelValue,0);

        Collections.reverse(levelValue);
        return levelValue;
    }

    public void bfs(TreeNode curr, List<List<Integer>> levelValue, int depth) {
        if(curr == null) return;
        if(levelValue.size() == depth) {
            List<Integer> values = new ArrayList<>();
            values.add(curr.val);
            levelValue.add(values);
        }else {
            List<Integer> values = levelValue.get(depth);
            values.add(curr.val);
            levelValue.set(depth, values);
        }

        bfs(curr.left, levelValue, depth+1);
        bfs(curr.right, levelValue, depth+1);
    }
}