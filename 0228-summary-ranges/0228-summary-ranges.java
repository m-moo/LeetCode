class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        if(nums.length == 0) return answer;

        int start = nums[0];
        int end = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1]+1 == nums[i]) end = nums[i];
            else {
                if(start == end) answer.add(String.valueOf(start));
                else answer.add(start+"->"+end);

                start = end = nums[i];
            }
        }
        if(start == end) answer.add(String.valueOf(start));
        else answer.add(start+"->"+end);

        return answer;
    }
}