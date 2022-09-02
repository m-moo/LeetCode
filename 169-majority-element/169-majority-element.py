class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        mj_cnt = int(len(nums)/2)
        hashmap = {}

        for n in nums:
            if hashmap.get(n) != None:
                hashmap[n] += 1
            else:
                hashmap[n] = 1

            if hashmap[n] > mj_cnt:
                return n
        return -1