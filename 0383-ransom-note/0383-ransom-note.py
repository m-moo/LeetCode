class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        mem = [0] * 26
        for i in range(len(magazine)):
            mem[ord(magazine[i]) - ord('a')] += 1
        
        for i in range(len(ransomNote)):
            idx = ord(ransomNote[i]) - ord('a')
            mem[idx] -= 1
            if mem[idx] < 0:
                return False

        return True