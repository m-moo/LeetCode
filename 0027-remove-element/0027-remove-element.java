class Solution {
    public int removeElement(int[] nums, int val) {
        int answer = 0;

        for(int i=0,end=nums.length-1;i<=end;i++) {
            if(nums[i] == val) {
                int tmp = nums[i];
                nums[i] = nums[end];
                nums[end] = tmp;
                i--;
                end--;
            }
            else answer++;
        }
        
        return answer;
    }
}