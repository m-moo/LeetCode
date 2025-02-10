class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        visited = set([(sr,sc)])
        queue = collections.deque([(sr,sc)])
        dirs = [(0,1), (1,0), (0,-1), (-1,0)]

        m = len(image)
        n = len(image[0])

        num = image[sr][sc]
        image[sr][sc] = color

        while(queue):
            curr_x, curr_y = queue.popleft()

            for x, y in dirs:
                next_x = curr_x + x
                next_y = curr_y + y

                if (0 <= next_x < m and 0 <= next_y < n 
                    and (next_x,next_y) not in visited
                    and image[next_x][next_y] == num):
                    queue.append((next_x,next_y))
                    visited.add((next_x,next_y))
                    image[next_x][next_y] = color

        return image