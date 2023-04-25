class Solution {
    int answer;
    public int jump(int[] nums) {
        int stepCount = 0;
        int lastMaxIdx = 0;
        int maxIdx = 0;

        for(int i=0;i<nums.length-1;i++) {
            maxIdx = Math.max(maxIdx, i+nums[i]);
            /* 현재 위치가 이전에 최대로 가능한 점프 위치에 도달하면, 현재 최대로 점프 가능한 위치로 갱신해준다 */
            if(i==lastMaxIdx) {
                stepCount++; // 최소 스탭 카운트를 증가
                lastMaxIdx = maxIdx;
            }
        }
        
        return stepCount;
    }
}