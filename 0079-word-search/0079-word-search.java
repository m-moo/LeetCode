class Solution {
    char[][] b;
    int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
    boolean rs = false;
    
    public boolean exist(char[][] board, String word) {
        b = board;
        for(int x=0;x<b.length;x++){
            if(rs) break;
            for(int y=0;y<b[0].length;y++){
                if(b[x][y] == word.charAt(0) && backTrack(x,y,word)) {
                    rs = true;
                    break;
                }
            }
        }
        
        return rs;
    }
    
    public boolean backTrack(int x, int y, String w) {
        if(x < 0 || x >= b.length ||
                y < 0 || y >= b[0].length) return false;

        if(b[x][y] != w.charAt(0)) return false;
        if(w.length()==1) return true;

        b[x][y] = '.';
        for(int i=0;i<dir.length;i++){
            if(backTrack(x+dir[i][0],y+dir[i][1],w.substring(1))) return true;
        }

        b[x][y] = w.charAt(0);
        return false;
    }
}