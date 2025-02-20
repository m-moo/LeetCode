class Solution:
    def updateMatrix(self, mat: List[List[int]]) -> List[List[int]]:
        m, n = len(mat), len(mat[0])
        dirs = [(-1, 0), (0, 1), (1, 0), (0 ,-1)]
        res = [[m * n] * n for _ in range(m)]

        queue = deque()
        # init 0 cells
        for i in range(m):
            for j in range(n):
                if mat[i][j] == 0:
                    res[i][j] = 0
                    queue.append((i, j))

        while queue:
            x, y = queue.popleft()
            for dir_x, dir_y in dirs:
                new_x, new_y = x + dir_x, y + dir_y

                if 0 <= new_x < m and 0 <= new_y < n:
                    if res[new_x][new_y] > res[x][y]:
                        res[new_x][new_y] = res[x][y] + 1
                        queue.append((new_x, new_y))

        return res