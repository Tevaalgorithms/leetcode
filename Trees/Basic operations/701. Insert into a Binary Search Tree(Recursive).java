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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = root;
        if(temp!= null && temp.val <= val) {
            if(temp.right != null) {
                temp = insertIntoBST(temp.right, val);
            } else {
                temp.right = new TreeNode(val);
            }
        }            
        else {
            if(temp.left != null) {          
                temp = insertIntoBST(temp.left, val);                
            } else {
                 temp.left = new TreeNode(val);
            }
        }        
        return root;
    }
}
