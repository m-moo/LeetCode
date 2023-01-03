class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int cnt = 1;

        for(int i=0;i<len;i++){
            if(cnt>=len) break;
            int idx = i;
            int prevNum = nums[idx];

            while(true) {
                int nextIdx = (idx+k)%len;

                int temp = nums[nextIdx];
                nums[nextIdx] = prevNum;
                prevNum = temp;

                idx = nextIdx;
                cnt++;
                if(idx==i) break;
            }
        }
        
    }
}