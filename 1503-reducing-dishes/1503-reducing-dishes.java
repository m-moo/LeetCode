class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int max = 0;
        int len = satisfaction.length;
        Arrays.sort(satisfaction);

        for(int i=len;i>0;i--) {
            int sum = 0;
            int cnt = i;
            for(int j=len-1;j>=len-i;j--) {
                sum += satisfaction[j]*cnt--;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}