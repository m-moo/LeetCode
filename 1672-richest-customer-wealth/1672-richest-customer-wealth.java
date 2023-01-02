class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] acc:accounts) {
            int total = 0;
            for(int m:acc) {
                total += m;
            }
            max = max<total?total:max;
        }
        return max;
    }
}