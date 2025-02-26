class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        res = 0
        dirs = [(-1, 0), (0, 1), (1, 0), (0, -1)]
        m, n = len(grid), len(grid[0])
        visited = set()

        def bfs(i: int, j: int):
            nonlocal res, dirs
            queue = [(i, j)]
            visited.add((i, j))
            
            area = 1
            while queue:
                x, y = queue.pop()
                for d_x, d_y in dirs:
                    new_x, new_y = x + d_x, y + d_y
                    if (0 <= new_x < m and 0 <= new_y < n and
                        grid[new_x][new_y] == 1 and
                        (new_x, new_y) not in visited):
                        queue.append((new_x, new_y))
                        visited.add((new_x, new_y))
                        area += 1
            res = max(res, area)

        for i in range(m):
            for j in range(n):
                if grid[i][j] == 1 and (i, j) not in visited:
                    bfs(i, j)

        return res