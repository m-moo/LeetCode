class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        backTrack(nums,new ArrayList<>(),answer);
        return answer;
    }
    public void backTrack(int[] nums, List<Integer> comb, List<List<Integer>> answer) {
        if(comb.size() == nums.length) {
            answer.add(new ArrayList<>(comb));
        }else {
            for(int i=0;i<nums.length;i++) {
                if(comb.contains(nums[i])) continue;
                comb.add(nums[i]);
                backTrack(nums,comb,answer);
                comb.remove(comb.size()-1);
            }
        }
    }
}