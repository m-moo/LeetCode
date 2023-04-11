class Solution {
    public int search(int[] nums, int target) {
        int answer = -1;

        int low = 0, high = nums.length-1;
        int mid;
        while(low<=high) {
            mid = low + (high-low)/2;

            /* target 값이면 그대로 반환 */
            if(nums[mid] == target) return mid;

            /* asc인 구간을 찾아 이진탐색 */
            if(nums[mid] >= nums[low]) {
                if(nums[low] <= target && nums[mid] >= target) high = mid-1;
                else low = mid+1;
            }else {
                if(nums[mid] <= target && nums[high] >= target) low = mid+1;
                else high = mid-1;
            }
        }
        return answer;
    }
}