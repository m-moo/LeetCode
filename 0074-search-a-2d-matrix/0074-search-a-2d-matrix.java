class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rLen = matrix.length, cLen = matrix[0].length;
        int low = 0, high = rLen*cLen-1;
        int mid;
        while(low<=high) {
            mid = low + (high-low)/2;

            int lowN = matrix[low/cLen][low%cLen];
            int midN = matrix[mid/cLen][mid%cLen];

            /* target 값이면 그대로 반환 */
            if(midN == target) return true;
            
            if(midN >= target && lowN <= target) high = mid-1;
            else low = mid+1;
        }
        
        return false;
    }
}