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
        if(root == null) {
            root = new TreeNode(val);
            return root;
        }
        TreeNode temp = root;
        
        while(temp != null) {
            if(temp.val < val){
              if(temp.right != null) {
                temp = temp.right;  
              } else {
                  temp.right = new TreeNode(val);
                  break;
              }
                 
            } else {
                if(temp.left != null) {
                    temp = temp.left;
                } else{
                    temp.left= new TreeNode(val);
                    break; 
                }                
            }
        }
        
        return root;
        
    }
}

