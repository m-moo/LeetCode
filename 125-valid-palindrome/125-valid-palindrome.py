class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = "".join(list(filter(str.isalnum, s))).lower()
        return s == s[::-1]