class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int start = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++) {
            count += nums[i]==0?1:0;

            while(count == 2) {
                count -= nums[start++]==0?1:0;
            }
            max = Math.max(i-start,max);
        }
        return max;
    }
}