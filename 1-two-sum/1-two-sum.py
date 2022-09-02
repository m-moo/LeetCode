class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashtable_dict = {}
    
        for i in range(0,len(nums)):
            value = target - nums[i]
            if hashtable_dict.get(value) is not None \
                and hashtable_dict[value] != i:
                return sorted([i, hashtable_dict[value]])

            hashtable_dict[nums[i]] = i

        return [-1, -1]