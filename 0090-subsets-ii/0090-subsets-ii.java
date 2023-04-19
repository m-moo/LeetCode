class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        List<Integer> track = new ArrayList<>();

        backTrack(nums,0,track, answer);
        
        return new ArrayList<>(answer);
    }
    
    public void backTrack(int[] nums, int idx, List<Integer> track, Set<List<Integer>> answer) {
        if(idx < nums.length) {
            track.add(nums[idx]);
            backTrack(nums,idx+1,track,answer);
            track.remove(track.size()-1);
            backTrack(nums,idx+1,track,answer);
        }else{
            List<Integer> rs = new ArrayList<>(track);
            Collections.sort(rs);
            answer.add(rs);
        }
    }
}