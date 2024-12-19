# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        
        def dfs(root: Optional[TreeNode]):
            if not root: return True, 0

            l_b, left = dfs(root.left)
            r_b, right = dfs(root.right)
        
            balanced = l_b and r_b and abs(left-right) <= 1
            return balanced, 1 + max(left, right)

        b, _ = dfs(root)
        return b