# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        l, r = 1, n
        
        res = 0
        while l <= r:
            mid = (l + r) // 2
            
            flag = isBadVersion(mid)
            if flag:
                res = mid
                r = mid - 1
            else:
                l = mid + 1
        
        return res