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
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
      ans = 1;
      height(root);
      return ans - 1;  
    }
    
    private int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        ans = Math.max(ans, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
