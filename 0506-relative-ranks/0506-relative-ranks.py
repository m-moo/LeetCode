class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        sorted_arr = sorted(enumerate(score), key=lambda x:-x[1])
        print(sorted_arr)

        res = [""]*len(score)

        idx = 1
        for i, _ in sorted_arr:
            rank = ""
            if idx == 1: rank = "Gold Medal"
            elif idx == 2: rank = "Silver Medal"
            elif idx == 3: rank = "Bronze Medal"
            else:
                rank = str(idx)
            
            res[i] = rank
            idx += 1

        return res