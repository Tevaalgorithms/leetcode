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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        
        TreeNode result = helper(root, val);
        
        return result;        
    }
    
    private TreeNode helper(TreeNode root, int val) {
        if(root == null) {
            return null;
        }
        TreeNode result = null;
        while(root != null) {
            if(root.val == val) {
                result = root;
                break;
            } else if(root.val < val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return result;
    }
}
