class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> answer = new HashSet();
        if(nums.length==0) return new ArrayList<>(answer);
        
        // 오름차순 정렬
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            // 포인터 생성
            int j = i+1;
            int k = nums.length-1;
            
            while(j < k) {
                int tot = nums[i] + nums[j] + nums[k];
                if(tot == 0) answer.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if(tot > 0) k--; // 결괏값이 크면 최댓값 차감
                else if(tot < 0) j++; // 결괏값이 모자르면 중간값 증가
            }
        }
        return new ArrayList<>(answer);
    }
}