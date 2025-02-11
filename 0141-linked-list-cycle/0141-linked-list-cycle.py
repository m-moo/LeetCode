# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        visited = []
        if head is None: return False
        
        while head not in visited:
            visited.append(head)
            if head.next == None: return False
            head = head.next

        return True