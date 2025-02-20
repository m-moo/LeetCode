class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        res = 0
        m, n = len(grid), len(grid[0])

        visited = set()
        dirs = [(-1, 0), (0, 1), (1, 0), (0, -1)]
        queue = []
        def bfs():
            while queue:
                x, y = queue.pop()
                visited.add((x, y))
                print(x,y)
                for dir_x, dir_y in dirs:
                    new_x, new_y = x + dir_x, y + dir_y
                    if (0 <= new_x < m and 0 <= new_y < n and 
                        grid[new_x][new_y] == "1" and 
                        (new_x, new_y) not in visited):
                        queue.append((new_x, new_y))
                        visited.add((new_x, new_y))
        
        for i in range(m):
            for j in range(n):
                if grid[i][j] == "1" and (i, j) not in visited:
                    queue.append((i,j))
                    bfs()
                    res += 1

        return res
        