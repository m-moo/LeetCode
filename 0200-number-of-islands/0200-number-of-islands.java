class Solution {
    public int numIslands(char[][] grid) {
        int answer = 0;

        for(int i=0;i< grid.length;i++) {

            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == '1') {
                    dfsMarking(grid,i,j);
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public void dfsMarking(char[][] g, int i, int j) {
        /* 범위 외 혹은 땅이 아니면 종료 */
        if(i < 0 || j < 0 || i >= g.length || j >= g[0].length || g[i][j] != '1') return;
        /* 방문한 땅은 물로 마킹 */
        g[i][j] = '0';
        /* 다른 방향으로 재탐색 */
        dfsMarking(g,i+1,j);
        dfsMarking(g,i-1,j);
        dfsMarking(g,i,j+1);
        dfsMarking(g,i,j-1);
    }
    
}