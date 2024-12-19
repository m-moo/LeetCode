# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        def dfs(root: Optional[TreeNode], depth: int):
            if not root:
                return depth
            
            left_d = dfs(root.left, depth + 1)
            right_d = dfs(root.right, depth + 1)

            return max(left_d, right_d)
        
        return dfs(root, 0)