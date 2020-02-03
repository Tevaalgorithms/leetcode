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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null || p == null) {
            return null;
        }
        //Step 1: Get the TreeNode that we are looking (SearchTreeNode)
        TreeNode result = getTreeNode(root, p, false);
        
        // Step 2: Check whether the SearchTreeNode has Right Sub stree
        //         If it has Right subtree then get the last left node from the right sub tree
        if(result.right != null) {
            result = getLastLeftNode(result.right);
        } 
        else 
        {
        // Step 3: If the Search node has no right sub tree, then we need to get the last left node from root 
        //         to it's path 
            result = getTreeNode(root, p, true);
        }        
           return result;    
    }
    
    private TreeNode getTreeNode(TreeNode root, TreeNode p, boolean isStoreLastLeft){
        if(root == null || p == null) {
            return null;
        }
        TreeNode result = null;
        TreeNode lastLeft = null;
        while(root != null) {
            if(root.val == p.val) {                
                result = root;
                break;
            } else if(root.val < p.val) {               
                root = root.right;
            } else {
                lastLeft = root;
                root = root.left;
            }            
        }
        
        if(isStoreLastLeft == true) {             
            return lastLeft;
        }
        
        return result;
    }
    
    private TreeNode getLastLeftNode(TreeNode root) {
        if(root == null){
            return null;
        }
        while(root.left != null) {
            root= root.left;
        }
        return root;
    }
}
