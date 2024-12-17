class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l, r = 0, len(nums) - 1
        while l <= r:
            m = (l + r) // 2
            if target == nums[m]:
                return m

            # middle is in left portion
            if nums[l] <= nums[m]:
                if target < nums[l] or nums[m] < target:
                    l = m + 1
                else:
                    r = m - 1
            else:
                if target < nums[m] or nums[r] < target:
                    r = m - 1
                else:
                    l = m + 1

        return -1
