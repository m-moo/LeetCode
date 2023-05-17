class Solution {
    public int removeDuplicates(int[] nums) {
        int answer = nums.length;

        int cnt = 1;
        int prev = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == prev) {
                cnt++;
                if(cnt > 2) {
                    nums[i] = 10001;
                    answer--;
                }
            }else {
                cnt = 1;
                prev = nums[i];
            }
        }
        cnt = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > 10000) cnt++;
            else {
                if(cnt > 0) {
                    nums[i-cnt] = nums[i];
                    nums[i] = 10001;
                }
            }
        }
        return answer;
    }
}