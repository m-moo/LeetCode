class Solution {
    public void solve(char[][] board) {
        int[][] dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int r = board.length;
        int c = board[0].length;
        Queue<int[]> startP = new LinkedList<>();
        /* 테두리 O를 dfs로 P로 변경 */
        for(int i=0;i<c;i++) {
            if(board[0][i] == 'O') dfs(board,0,i);
            if(board[r-1][i] == 'O') dfs(board,r-1,i);
        }
        for(int i=0;i<r;i++) {
            if(board[i][0] == 'O') dfs(board,i,0);
            if(board[i][c-1] == 'O') dfs(board,i,c-1);
        }

        swap(board,'O','X');
        swap(board,'P','O');
    }
    
    /* 글자 변환 */
    public void swap(char[][] board, char origin, char to) {
        for(int i=0;i< board.length;i++)
            for(int j=0;j<board[0].length;j++)
                if(board[i][j] == origin) board[i][j] = to;
    }

    /* O를 P로 변환 */
    public void dfs(char[][] board, int i, int j) {
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') return;
        board[i][j] = 'P';
        dfs(board,i,j+1);
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j-1);
    }
}
