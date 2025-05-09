class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        res = 0
        cnt = 1
        if len(nums) < 1: return res
        sorted_nums = sorted(nums)

        pre = sorted_nums[0]
        for n in sorted_nums:            
            if pre == n - 1:
                cnt += 1
            elif pre != n:
                cnt = 1
            
            pre = n
            res = max(cnt, res)

        return res
            
