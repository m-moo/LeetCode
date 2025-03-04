class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        def backtrack(curr: List[int]):
            if len(curr) == len(nums):
                res.append(curr.copy())
                return
            
            for n in nums:
                if n not in curr:
                    curr.append(n)
                    backtrack(curr)
                    curr.pop()

        backtrack([])

        return res