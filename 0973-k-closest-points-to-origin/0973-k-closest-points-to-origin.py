class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        min_heap = []

        for idx, arr in enumerate(points):
            val = arr[0]**2 + arr[1]**2
            heapq.heappush(min_heap, (val, idx))

        res = [points[heapq.heappop(min_heap)[1]] for _ in range(k)]

        return res