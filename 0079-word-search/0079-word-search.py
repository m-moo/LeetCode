class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        rows , cols = len(board), len(board[0])
        tot_cells = rows * cols
        if len(word) > tot_cells: return False

        board_cnt = Counter()
        for row in board:
            board_cnt.update(row)
        word_cnt = Counter(word)

        for c in word:
            if word_cnt[c] > board_cnt[c]:
                return False

        path = set()
        def dfs(r, c, i):
            if i == len(word):
                return True
            
            if (min(r, c) < 0 or
                r >= rows or c >= cols or
                board[r][c] != word[i] or
                (r, c) in path):
                return False
            
            path.add((r, c))
            res = (dfs(r, c + 1, i + 1) or
                    dfs(r + 1, c, i + 1) or
                    dfs(r, c - 1, i + 1) or
                    dfs(r - 1, c, i + 1))
            path.remove((r, c))
            return res

        for i in range(rows):
            for j in range(cols):
                if dfs(i, j, 0):
                    return True
        return False