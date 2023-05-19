class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;

        for(int i=1;i< prices.length;i++) {
            if(prices[i] > prices[i-1]) answer += prices[i] - prices[i-1];
        }
        
        return answer;
    }
}