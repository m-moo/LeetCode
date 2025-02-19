from collections import Counter

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count_nums = Counter(nums)
        for num, cnt in count_nums.most_common():
            if cnt > len(nums) // 2: 
                return num
        