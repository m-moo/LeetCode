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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>  answer = new ArrayList<>();
        if(root == null) return answer;

        bfs(root, answer, 0);

        return answer;
    }

    public void bfs(TreeNode curr, List<List<Integer>> result, int depth) {
        if(curr == null) return;
        if(depth == result.size()){
                result.add(new ArrayList<Integer>(){{
                    add(curr.val);
                }});
        }else {
            List<Integer> currResult = result.get(depth);
            currResult.add(curr.val);
            result.set(depth, currResult);
        }
        bfs(curr.left, result, depth+1);
        bfs(curr.right, result, depth+1);
    }
}