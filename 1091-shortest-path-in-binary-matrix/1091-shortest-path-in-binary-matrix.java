class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1) return -1;

        int len = grid.length;
        int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{0,0,0});
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            /* 도착지 도달 */
            if(curr[0] == grid.length-1 && curr[1] == grid[0].length-1) return curr[2]+1;

            /* 방향 별로 이동 */
            for(int i=0;i<dir.length;i++) {
                int x = curr[0]+dir[i][0];
                int y = curr[1]+dir[i][1];
                
            if(x > -1 && y > -1 && x < len && y < len && grid[x][y] == 0) {
                    grid[x][y] = -1;
                    q.add(new int[]{x,y,curr[2]+1});
                }
            }
        }
        return -1;
    }
}