class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        double tot = 0;

        int s = 0, e = 0;
        while (e < nums.length) {
            if (s + k != e) {
                tot += nums[e++];
            } else {
                tot += nums[e++];
                tot -= nums[s++];
            }
            if (s + k == e) {
                double avg = tot / k;
                max = Math.max(avg, max);
            }
        }
        return max;
    }
}