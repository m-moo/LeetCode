class Solution {
    public void solve(char[][] board) {
        int[][] dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int answer = -1;
        
        int r = board.length;
        int c = board[0].length;
        Queue<int[]> startP = new LinkedList<>();
        /* 테두리 O 체크 */
        for(int i=0;i<c;i++) {
            if(board[0][i] == 'O') startP.add(new int[]{0,i});
            if(board[r-1][i] == 'O') startP.add(new int[]{r-1,i});
        }
        for(int i=0;i<r;i++) {
            if(board[i][0] == 'O') startP.add(new int[]{i,0});
            if(board[i][c-1] == 'O') startP.add(new int[]{i,c-1});
        }

        /* 테두리 O를 1로 변경 */
        while(!startP.isEmpty()) {
            int[] curr = startP.poll();
            board[curr[0]][curr[1]] = '1';

            /* 'O' 타일 사방 탐색, 다음 진행 포인트 적재 */
            for(int i=0;i< dir.length;i++) {
                int nx = curr[0]+dir[i][0];
                int ny = curr[1]+dir[i][1];
                
                if(nx > -1 && ny > -1 && nx < board.length && ny < board[0].length
                    && board[nx][ny] == 'O') {
                    board[nx][ny] = '1';
                    startP.add(new int[]{nx,ny});
                }
            }
        }
        
        /* 1 타일은 O로, O 타일은 X로 변환 */
        for(int i=0;i<board.length;i++) {
            
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j] == '1') board[i][j] = 'O';
                else if(board[i][j] == 'O') board[i][j] = 'X';
            }
        }
    }
}