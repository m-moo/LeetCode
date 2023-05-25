class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        /* 대각선으로 교환 */
        for(int i=0, j=1;i<n;i++) {
            for(int k=j;k<n;k++) {
                int tmp = matrix[i][k];
                matrix[i][k] = matrix[k][i];
                matrix[k][i] = tmp;
            }
            j++;
        }
        /* 좌우로 교환 */
        for(int i=0;i<n;i++) {
            for(int j=0;j<n/2;j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = tmp;
            }
        }
    }
}