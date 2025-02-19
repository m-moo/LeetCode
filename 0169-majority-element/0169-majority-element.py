from collections import Counter

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        res = 0
        
        mj_cnt = len(nums) // 2
        count_nums = Counter(nums)
        for num, cnt in count_nums.most_common():
            if cnt > mj_cnt: 
                return num
        