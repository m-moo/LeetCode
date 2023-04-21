class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates, 0, target, new ArrayList<>(), answer);
        
        return new ArrayList<>(answer);
    }
    
    public void backTrack(int[] nums, int idx, int remain, List<Integer> track, List<List<Integer>> answer) {
        if(idx==nums.length){
            if(remain == 0)
                answer.add(new ArrayList<>(track));
            return;
        }
        if(nums[idx] <= remain) {
            track.add(nums[idx]);
            backTrack(nums,idx, remain-nums[idx],track,answer);
            track.remove(track.size()-1);
        }
        backTrack(nums,idx+1, remain,track,answer);
    }
}