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
    // InOrder Traversal : Left - Root - Right
    // PostOrder Traversal : Left - Right - Root
        int postOrderIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode result = null;
        
        if(inorder == null || inorder.length == 0 || postorder == null || postorder.length == 0) {
            return result;
        }
        
        // Here the key is the elements and index is the value
        HashMap<Integer, Integer> inorderMap = new HashMap<>();
        
        for(int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        
        postOrderIndex = postorder.length - 1;
        
        result = helper(inorderMap, postorder, 0, postorder.length - 1);
        
        return result;   
    }
      /*
        inorder =   [9,3,15,20,7]
        postorder = [9,15,7,20,3]
        */
        
    private TreeNode helper(HashMap<Integer, Integer> inorderMap, int[] postorder, 
                            int startIndex, int endIndex) {
        // base condition
        if(startIndex > endIndex) {
            return null;
        }
        
        // Last element from the post order is the root
        TreeNode root = new TreeNode(postorder[postOrderIndex--]);
        
        if(startIndex == endIndex) {
            return root;
        }
        
        // Now I need to construct left sub tree and right sub tree
        int inorderMapIndex = inorderMap.get(root.val);      
        
        // Teva!!! LOOK AT THE ORDER OF SUB TREE.. RIGHT then LEFT THINK WHY???
        root.right = helper(inorderMap, postorder, inorderMapIndex + 1, endIndex);
        
        root.left = helper(inorderMap, postorder, startIndex, inorderMapIndex - 1);
        
        return root;
    }
  
    
}
