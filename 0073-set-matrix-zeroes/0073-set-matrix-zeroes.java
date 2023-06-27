class Solution {
    public void setZeroes(int[][] matrix) {
        Set<int[]> zeroSet = new HashSet<>();
        for(int i=0;i< matrix.length;i++) {
            for(int j=0;j< matrix[i].length;j++) {
                if(matrix[i][j] == 0) zeroSet.add(new int[]{i,j});
            }
        }
        for(int[] loc: zeroSet) {
            for(int i=0;i< matrix.length;i++) {
                matrix[i][loc[1]] = 0;
            }
            for(int j=0;j<matrix[0].length;j++) {
                matrix[loc[0]][j] = 0;
            }
        }
    }
}