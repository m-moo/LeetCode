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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> answer = new ArrayList<>();
        if(root == null) return answer;

        List<double[]> result = new ArrayList<>();
        bfs(root, result, 0);

        for(double[] rs:result) {
            double calc = rs[0]/rs[1];
            answer.add(calc);
        }
        return answer;
    }

    public void bfs(TreeNode curr, List<double[]> result, int depth) {
        if(curr == null) return;
        if(depth == result.size()){
                result.add(new double[]{curr.val,1});
        }else {
            double[] currResult = result.get(depth);
            currResult[0] += curr.val;
            currResult[1]++;
            result.set(depth, currResult);
        }
        bfs(curr.right, result, depth+1);
        bfs(curr.left, result, depth+1);
    }
}