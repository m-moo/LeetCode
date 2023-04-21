class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates, 0, target, new ArrayList<>(), answer);
        
        return new ArrayList<>(answer);
    }
    
    public void backTrack(int[] nums, int idx, int remain, List<Integer> track, List<List<Integer>> answer) {
        if(remain == 0) {
            Collections.sort(track);
            answer.add(new ArrayList<>(track));
        }else if(remain < 0) return;
        else {
            for(int i=idx;i<nums.length;i++) {
                track.add(nums[i]);
                backTrack(nums,i, remain-nums[i],track,answer);
                track.remove(track.size()-1);
            }
        }
    }
}