class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        /* 배열의 길이가 홀수일 경우를 위해 두 케이스를 실행하여 비교 */
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }
    
    public int rob(int[] num, int start, int end) {
        int include = 0, exclude = 0;
        for (int j = start; j <= end; j++) {
            int i = include, e = exclude;
            include = e + num[j];
            exclude = Math.max(e, i);
        }
        return Math.max(include, exclude);
    }
}