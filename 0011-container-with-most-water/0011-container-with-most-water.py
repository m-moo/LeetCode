class Solution:
    def maxArea(self, height: List[int]) -> int:
        l, r = 0, len(height) - 1
        max_amount = 0
        while l < r:
            l_h, r_h = height[l], height[r]
            amount = (r - l) * min(l_h, r_h)
            max_amount = max(max_amount, amount)

            if l_h <= r_h:
                l += 1
            if l_h > r_h:
                r -= 1
        
        return max_amount