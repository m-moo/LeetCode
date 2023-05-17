class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int answer = len;
        int[] map = new int[nums[len-1]-nums[0]+1];
        int start = nums[0];

        for(int i=0;i<nums.length;i++) map[nums[i]-start]++;

        int idx = 0;
        for(int i=0;i<map.length;i++) {
            if(map[i] != 0) {
                nums[idx++] = i+start;
                if(map[i] > 1) answer -= map[i]-1;
            }
        }
        return answer;
    }
}