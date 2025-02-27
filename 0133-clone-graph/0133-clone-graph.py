"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if not node: return None

        new_graph = {}
        new_graph[node] = Node(node.val)
        queue = deque([node])

        while queue:
            curr = queue.popleft()
            for n in curr.neighbors:
                if n not in new_graph:
                    new_graph[n] = Node(n.val)
                    queue.append(n)
                new_graph[curr].neighbors.append(new_graph[n])

        return new_graph[node]
