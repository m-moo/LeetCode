class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] visited = new boolean[n * n + 1];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1,0});
        visited[1] = true;

        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int loc = curr[0];
            int moveCount = curr[1];

            if(loc == n*n) return moveCount;

            for(int i=1;i<=6;++i) {
                int nextLoc = loc+i;
                if(nextLoc > n*n) break; // 보드 범위 넘음

                int r = (nextLoc-1)/n, c = (nextLoc-1)%n;
                c = r%2!=0?n-1-c:c; // for Boustrophedon style
                r = n-1-r;
                if(board[r][c] > 0) nextLoc = board[r][c];

                if(!visited[nextLoc]) {
                    visited[nextLoc] = true;
                    q.add(new int[]{nextLoc,moveCount+1});
                }
            }
        }
        return -1; 
    }
}