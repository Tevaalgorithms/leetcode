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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return root;
        }
        
        if(root.val == key) {
            
            if(root.left == null){
                return root.right;
            }
            
            if(root.right == null) {
                return root.left;
            }
            
            // replace root with its successor if root has two children            
            TreeNode p = findSuccessor(root);
            root.val = p.val;
            root.right = deleteNode(root.right, p.val);
            return root;            
        }
        if (root.val < key) {
            // find target in right subtree if root->val < key
            root.right = deleteNode(root.right, key);
        } else {
            // find target in left subtree if root->val > key
            root.left = deleteNode(root.left, key);
        }
        return root;
    }
    
    private TreeNode findSuccessor(TreeNode root){
        TreeNode curr = root.right;
        while(curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
}
