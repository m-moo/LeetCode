class Solution {
    public int search(int[] nums, int target) {
        int rs = -1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) rs = i;
        }
        return rs;
    }
}