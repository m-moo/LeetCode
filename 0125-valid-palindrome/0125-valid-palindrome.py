class Solution:
    def is_alph(self, c):
        return (ord('A') <= ord(c) <= ord('Z') or 
                ord('a') <= ord(c) <= ord('z') or 
                ord('0') <= ord(c) <= ord('9'))

    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        
        l, r = 0, len(s) - 1
        while l < r:
            while l < r and not self.is_alph(s[l]):
                l += 1
            while l < r and not self.is_alph(s[r]):
                r -= 1
            if s[l] != s[r]:
                return False
            l, r = l + 1, r - 1

        return True