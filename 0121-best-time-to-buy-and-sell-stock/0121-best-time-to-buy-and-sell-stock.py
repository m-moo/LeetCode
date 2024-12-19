class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res = 0
        if len(prices) == 1:
            return res
        
        l, r = 0, 1
        while r < len(prices):
            if prices[l] < prices[r]:
                res = max(res, prices[r] - prices[l])
            else:
                l = r
            r += 1
        return res
        