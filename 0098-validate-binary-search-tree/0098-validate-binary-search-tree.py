# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        def valid(node: Optional[TreeNode], min_val: int, max_val: int):
            if not node: return True

            if not (node.val > min_val and node.val < max_val):
                return False

            return valid(node.left, min_val, node.val) and valid(node.right, node.val, max_val)

        return valid(root, float("-inf"), float("inf"))
