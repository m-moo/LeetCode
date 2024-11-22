class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res = 0
        if len(prices) == 1:
            return res
        
        l, r = 0, 1
        while r < len(prices):
            res = max(res, prices[r] - prices[l])
            if prices[l] > prices[r]:
                l += 1
            else:
                r += 1

            if l == r:
                r += 1
        return res
        