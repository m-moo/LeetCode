# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        res = -1000

        def dfs(root: Optional[TreeNode]):
            if not root: return 0

            left = dfs(root.left)
            right = dfs(root.right)
            
            nonlocal res
            res = max(res, root.val, root.val+left+right, root.val+left, root.val+right)

            return max(root.val, root.val + max(left, right))
        
        val = dfs(root)
        return max(res, val)