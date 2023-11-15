class Solution {
    public int getMaximumGenerated(int n) {
        if(n == 0) return 0;
        int max = 0;
        int[] nums = new int[n+1];
        nums[1] = max = 1;
        for(int i=1;i*2<=n;i++) {
            nums[2*i] = nums[i];
            if(2*i+1 <= n) {
                int num = nums[i]+ nums[i+1];
                nums[2*i+1] = num;
                max = Math.max(max, num);
            }
        }
        return max;
    }
}