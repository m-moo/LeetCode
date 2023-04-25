class Solution {
    int answer = 0;
    public int uniquePaths(int m, int n) {
        int[][] map = new int[m][n];
        
        /* {0,n} 과 {n,0} 셀은 한방향으로만 접근할 수 있으므로 1을 기록해둔다 */
        for(int i=0;i<m;i++) {
            map[i][0] = 1;
        }
        for(int i=0;i<n;i++) {
            map[0][i] = 1;
        }
        
        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
                /* 해당 셀로 진입할 수 있는 위,왼쪽 셀의 진입가능 변수를 더한다 */
                map[i][j] = map[i-1][j] + map[i][j-1];
            }
        }
        
        return map[m-1][n-1];
    }
}