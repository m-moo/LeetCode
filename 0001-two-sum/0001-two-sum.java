class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        HashMap<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) numMap.put(nums[i],i);

        for(int i=0;i< nums.length;i++) {
            int need = target-nums[i];
            Integer rs = numMap.get(need);
            if(rs != null && rs != i) {
                answer[0] = i;
                answer[1] = numMap.get(need);
                break;
            }
        }
        return answer;
    }
}