class Solution {
    public int majorityElement(int[] nums) {
        int answer = 0;

        Arrays.sort(nums);
        int max = 0;
        int cnt = 1;
        int prev = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(prev == nums[i]) cnt++;
            else {
                if(max < cnt) {
                    answer = nums[i-1];
                    max = cnt;
                }
                prev = nums[i];
                cnt = 1;
            }
        }
        if(max < cnt) answer = nums[nums.length-1];
        return answer;
    }
}