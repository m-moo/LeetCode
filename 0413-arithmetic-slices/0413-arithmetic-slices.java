class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int answer = 0;

        if(nums.length < 3) answer = 0;

        for(int i=2,prev=0;i<nums.length;i++) {
            answer += nums[i] - nums[i-1] == nums[i-1] - nums[i-2]?++prev:(prev=0);
        }
        return answer;
    }
}