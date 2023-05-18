class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int answer = Integer.MAX_VALUE;

        int tot = 0;
        for(int i=0,j=0;j<nums.length;j++) {
            tot += nums[j];
            while(tot >= target) {
                answer = Math.min(answer,j-i+1);
                tot -= nums[i++];
            }
        }
        if(tot < target && answer == Integer.MAX_VALUE) answer = 0;
        
        return answer;
    }
}