class Solution {
    List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph,0,path,answer);
        
        return answer;
    }
    
    public void dfs(int[][] g, int node, List<Integer> path, List<List<Integer>> answer) {
        if(node+1 == g.length) {
            answer.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<g[node].length;i++) {
            path.add(g[node][i]);
            dfs(g, g[node][i], path, answer);
            path.remove(path.size()-1);
        }
    }
}