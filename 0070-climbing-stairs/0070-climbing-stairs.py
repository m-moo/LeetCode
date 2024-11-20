class Solution:
    def climbStairs(self, n: int) -> int:
        if n < 3:
            return n

        prev1, prev2 = 1,2

        for n in range(3,n+1):
            temp = prev2
            prev2 = prev1 + prev2
            prev1 = temp

        return prev2