class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = matrix[0].length-1;
        while(r < matrix.length && c > -1) {
            int n = matrix[r][c];

            if(n==target) return true;

            if(n < target) r++;
            else if (n > target) c--;
        }
        return false;
    }
}