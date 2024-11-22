class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 1:
            return 1
        
        subs = []
        l, r = 0, 1
        res = 0

        while r < len(s):
            if not subs:
                subs.append(s[l])

            if s[r] in subs:
                res = max(res, len(subs))
                l += 1
                r = l
                subs = []
            else:
                subs.append(s[r])
            
            r += 1
            if r == len(s):
                res = max(res, len(subs))

        return res