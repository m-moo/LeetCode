class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = {-1,-1};

        for(int i=0;i<nums.length;i++) {
            int n = nums[i];
            if(n == target) {
                if(answer[0] == -1) answer[0] = i;
                answer[1] = i;
            }
        }
        
        return answer;
    }
}