# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def getTargetCopy(self, original, cloned, target):
        
        ans=[]

        def inorder(root):
            if(root==None):
                return
            
            inorder(root.left)
            if(root.val == target.val):
                ans.append(root)
                return
            inorder(root.right)

        inorder(cloned)
        return ans[0]
        
        """
        :type original: TreeNode
        :type cloned: TreeNode
        :type target: TreeNode
        :rtype: TreeNode
        """
        