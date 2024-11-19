class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        default = amount + 1
        dp = [default] * (default)
        dp[0] = 0

        for n in range(1, amount + 1):
            for coin in coins:
                if n - coin >= 0:
                    dp[n] = min(dp[n], 1 + dp[n-coin])
        return dp[amount] if dp[amount] != default else -1