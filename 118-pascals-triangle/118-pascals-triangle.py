class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1]]
        for i in range(1,numRows):
            curr_list = [1 for j in range(i+1)]
            if i!=1 :
                for j in range(1,i):
                    curr_list[j] = result[i-1][j-1]+result[i-1][j]
            result.append(curr_list)
        return result