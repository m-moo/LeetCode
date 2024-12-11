class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m, n = len(matrix), len(matrix[0])
        
        mid = m * n // 2
        l, r = 0, m * n
        while l < r:
            row, col = mid//n, mid%n-1
            mid_val = matrix[row][col]

            if mid_val == target:
                return True
            if mid_val < target:
                l = mid + 1
            else:
                r = mid - 1
            mid = (r + l) // 2

        return False