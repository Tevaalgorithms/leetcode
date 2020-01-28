/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true; 
        int left = height(root.left) ;
        int right = height(root.right);
        return Math.abs(left - right) < 2 
            && isBalanced(root.left) 
            && isBalanced(root.right);  
    }
    
    public int height(TreeNode root) {
        if(root == null) {
            return -1;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }
}
