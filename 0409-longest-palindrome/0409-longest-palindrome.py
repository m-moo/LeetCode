from collections import Counter

class Solution:
    def longestPalindrome(self, s: str) -> int:
        alph_cnt = Counter(s)
        res = 0
        odd_flag = False

        for n in alph_cnt.values():
            res += n // 2 * 2
            if n % 2 != 0:
                odd_flag = True

        return res + (1 if odd_flag else 0)