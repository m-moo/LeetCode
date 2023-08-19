class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy = Integer.MIN_VALUE;
        int sell = 0;

        for(int price:prices) {
            buy = Math.max(buy, sell-price); // 현재 수익에서 구매 시 지출과 이전 지출 비교
            sell = Math.max(sell, buy+price-fee); // 이전 수익과 현재 매도할 경우의 수익 비교
        }
        return sell;
    }
}