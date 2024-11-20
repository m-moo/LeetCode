class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) < 2:
            return nums[0]
            
        for i in range(2, len(nums)):
            nums[i] += max(nums[i-2], nums[i-3] if i-3 > -1 else 0)
        
        return max(nums[-2], nums[-1])