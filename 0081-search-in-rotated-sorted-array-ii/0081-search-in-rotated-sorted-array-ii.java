class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, h = nums.length-1;
        while(l <= h) {
            int m = (l+h)/2;

            if(nums[m] == target || nums[l] == target || nums[h] == target) return true;

            /* asc 구간 구분 */
            if(nums[l] < nums[m]) {
                /* target이 구간 밖이면 다른 구간으로 범위 축소 */
                if(target < nums[l] || target > nums[m]) l = m+1;
                else h = m-1;
            }else if (nums[m] < nums[h]){
                if(target > nums[h] || target < nums[m]) h = m-1;
                else l = m+1;
            }else l++;
        }
        return false;
    }
}