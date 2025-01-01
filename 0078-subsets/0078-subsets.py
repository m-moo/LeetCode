class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        def backtrack(curr: List[int], idx: int):
            if idx == len(nums): return

            print(curr)

            while idx < len(nums):
                curr.append(nums[idx])
                res.append(list(curr))

                idx += 1
                backtrack(list(curr), idx)

                curr.pop()
        
        res.append([])
        backtrack([], 0)

        return res