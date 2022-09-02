class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        curr = nums[0]
        cnt = 0
        if len(nums) > 0:
            cnt += 1
            for i in range(1,len(nums)):
                if nums[i] != curr:
                    curr = nums[i]
                    nums[cnt] = curr
                    cnt += 1

        return cnt