class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        for(int i=0;i<len/2;i++){
            int end = len-1-i;
            int tmp = nums[i];
            nums[i] = nums[end];
            nums[end] = tmp;
        }
        
        for(int i=0;i<k/2;i++){
            int end = k-1-i;
            int tmp = nums[i];
            nums[i] = nums[end];
            nums[end] = tmp;
        }

        for(int i=0;i<(len-k)/2;i++){
            int end = len-1-i;
            int start = i+k;
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
        }
        
    }
}