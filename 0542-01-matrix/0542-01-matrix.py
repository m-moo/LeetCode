class Solution:
    def updateMatrix(self, mat: List[List[int]]) -> List[List[int]]:
        m, n = len(mat), len(mat[0])
        visited = set()
        dirs = [(-1, 0), (0, 1), (1, 0), (0 ,-1)]
        
        def bfs(i: int, j: int):
            queue = []
            queue.append((i, j))

            while queue:
                x, y = queue.pop()
                visited.add((x, y))
                
                min_distance = m * n
                for dir_x, dir_y in dirs:
                    new_x, new_y = x + dir_x, y + dir_y
                    if 0 <= new_x < m and 0 <= new_y < n:
                        if mat[new_x][new_y] == 0:
                            min_distance = 0
                            break
                        if (new_x, new_y) not in visited:
                            bfs(new_x, new_y)
                        min_distance = min(min_distance, mat[new_x][new_y])
                mat[x][y] = min_distance + 1
        
        for i in range(m):
            for j in range(n):
                if mat[i][j] != 0 and (i, j) not in visited:
                    bfs(i, j)

        return mat