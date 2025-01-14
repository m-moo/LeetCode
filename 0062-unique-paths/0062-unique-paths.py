class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        r_map = [[1 for col in range(n)] for row in range(m)]

        for r in range(1, m):
            for c in range(1, n):
                r_map[r][c] = r_map[r-1][c] + r_map[r][c-1]

        return r_map[m-1][n-1]