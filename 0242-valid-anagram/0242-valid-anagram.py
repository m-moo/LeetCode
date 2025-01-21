class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        
        s_cnt = Counter(s)
        t_cnt = Counter(t)

        for c in s:
            if s_cnt[c] != t_cnt[c]:
                return False
        return True