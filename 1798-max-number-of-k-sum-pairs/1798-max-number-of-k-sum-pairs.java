class Solution {
    public int maxOperations(int[] nums, int k) {
        int len = nums.length;

        int answer = 0;
        Arrays.sort(nums);
        int left = 0, right = len-1;

        while(left<right) {
            int sum = nums[left] + nums[right];

            if(sum == k) {
                answer++;
                left++;
                right--;
            }else if(sum > k) {
                right--;
            }else if(sum < k) {
                left++;
            }
        }
        return answer;
    }
}