class Solution {
    boolean[] visited;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        visited = new boolean[nums.length];

        backTrack(nums,new ArrayList<>(),answer);
        
        return new ArrayList<>(answer);
    }
    
    public void backTrack(int[] nums, List<Integer> track, Set<List<Integer>> answer) {
        if(track.size() == nums.length) {
            answer.add(new ArrayList<>(track));
            return;
        }

        for(int i=0;i<nums.length;i++) {
            if(!visited[i]) {
                visited[i] = true;
                track.add(nums[i]);
                backTrack(nums, track, answer);
                visited[i] = false;
                track.remove(track.size()-1);
            }
        }
    }
}