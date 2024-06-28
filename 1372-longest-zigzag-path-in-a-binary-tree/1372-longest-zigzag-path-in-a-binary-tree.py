# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def longestZigZag(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        ans=0
        stack=[(root, 0, None)]
        while(stack):
            node, n, left= stack.pop()
            if node:
                ans=max(ans, n)
                stack.append((node.left,1 if left else n+1,1))
                stack.append((node.right,n+1 if left else 1,0))
        return ans
        