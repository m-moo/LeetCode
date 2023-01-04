class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        for(int i=0;i<len;i++){
            int n = nums[i];
            if(n==0){
                cnt++;
            }else{
                if(cnt>0){
                    nums[i-cnt] = n;
                    nums[i] = 0;
                }
            }
        }
    }
}