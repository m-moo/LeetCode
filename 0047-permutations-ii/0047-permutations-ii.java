class Solution {
    boolean[] visited;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        visited = new boolean[nums.length];

        backTrack(nums,0,new ArrayList<>(),answer);
        
        return new ArrayList<>(answer);
    }
    
    public void backTrack(int[] nums, int idx, List<Integer> track, Set<List<Integer>> answer) {
        if(idx >= nums.length) {
            answer.add(new ArrayList<>(track));
            return;
        }

        for(int i=0;i<nums.length;i++) {
            if(!visited[i]) {
                visited[i] = true;
                track.add(nums[i]);
                backTrack(nums, idx+1, track, answer);
                visited[i] = false;
                track.remove(track.size()-1);
            }
        }
    }
}