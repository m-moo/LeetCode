class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        max_heap = []

        for n in stones:
            heapq.heappush(max_heap, -n)
        
        while len(max_heap) > 1:
            y = -heapq.heappop(max_heap)
            x = -heapq.heappop(max_heap)

            if x != y:
                remain = y - x
                heapq.heappush(max_heap, -remain)
        
        return -max_heap[0] if max_heap else 0