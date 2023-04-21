class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates, 0, target, new ArrayList<>(), answer);
        
        return answer;
    }
    
    public void backTrack(int[] nums, int idx, int remain, List<Integer> track, List<List<Integer>> answer) {
        if (remain == 0) {answer.add(new ArrayList<>(track)); return;}
        for(int i=idx;i<nums.length;i++) {
            if(i > idx && nums[i] == nums[i-1]) continue; //skip dup
            if(nums[i] > remain){break;} // no more need to proceed
            track.add(nums[i]);
            backTrack(nums,i+1, remain-nums[i],track,answer);
            track.remove(track.size()-1);
        }
    }
}