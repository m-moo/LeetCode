class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        backTrack(nums,0,new ArrayList<>(), answer);
        
        return answer;
    }
    
    public void backTrack(int[] nums, int idx, List<Integer> track, List<List<Integer>> answer) {
        answer.add(new ArrayList<>(track));
        for(int i=idx;i< nums.length;i++) {
            /* 이전 idx의 숫자가 같다면 이미 추가된 경우이므로 건너뛴다 */
            if(i!=idx && nums[i]==nums[i-1]) continue;
            track.add(nums[i]);
            backTrack(nums,i+1,track,answer);
            track.remove(track.size()-1);
        }
    }
}