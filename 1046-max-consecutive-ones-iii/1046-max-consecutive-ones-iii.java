class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int start = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++) {
            count += nums[i]==0?1:0;

            while(count > k) {
                count -= nums[start++]==0?1:0;
            }

            max = Math.max(i-start+1,max);
        }
        return max;
    }
}