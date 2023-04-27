class Solution {
    public int lengthOfLIS(int[] nums) {
        int answer = 0;

        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            /* binsearch로 현재 범위 내에서 i번째 숫자의 위치를 계산 */
            int idx = Arrays.binarySearch(dp,0,answer,nums[i]);
            if(idx < 0) idx = -(idx+1);
            dp[idx] = nums[i];
            /* 새로운 자리에 추가됐다면 범위 증가 */
            if(answer==idx) answer++;
        }
        
        return answer;
    }
}