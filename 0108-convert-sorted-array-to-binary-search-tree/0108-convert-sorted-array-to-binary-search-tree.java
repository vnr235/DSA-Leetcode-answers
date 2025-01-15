/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return soll(nums, 0, nums.length-1);
        
    }
    private TreeNode soll(int[] arr, int left, int right){
        if(left > right){
            return null;
        }
        int middle = left + (right-left)/2;
        TreeNode node = new TreeNode(arr[middle]);
        node.left = soll(arr, left, middle-1);
        node.right= soll(arr, middle+1, right);

        return node;
    }
}