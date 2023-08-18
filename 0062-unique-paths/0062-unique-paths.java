class Solution {
    public int uniquePaths(int m, int n) {
        int[][] map = new int[m + 1][n + 1];

        map[1][1] = 1;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (i == 1 && j == 1) continue;
                map[i][j] = map[i - 1][j] + map[i][j - 1];
            }
        }
        return map[m][n];
    }
}