class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> track = new ArrayList<>();

        backTracking(nums,0,track, answer);
        
        return answer;
    }
    public void backTracking(int[] nums, int idx, List<Integer> track, List<List<Integer>> answer) {
        if(idx < nums.length) {
            track.add(nums[idx]);
            backTracking(nums,idx+1,track,answer);
            track.remove(track.size()-1);
            backTracking(nums,idx+1,track,answer);
        }else answer.add(new ArrayList<>(track));
    }
}