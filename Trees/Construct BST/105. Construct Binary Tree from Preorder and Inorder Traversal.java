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
    
    int preOrderIndex;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) {
            return null;
        }
        HashMap<Integer, Integer> inorderMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        
        int startIndex = 0;
        
        int endIndex = preorder.length - 1;
        
        preOrderIndex = 0;
        
        return helper(preorder, inorderMap, startIndex, endIndex);       
    }
    
    private TreeNode helper(int[] preorder, HashMap<Integer, Integer> inorderMap, 
                            int startIndex, int endIndex) {
        // base case:
        if(startIndex > endIndex) {
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[preOrderIndex++]);
        
        if(startIndex == endIndex) {
            return root;
        }
        
        int inorderIndex = inorderMap.get(root.val);
        
        root.left = helper(preorder, inorderMap, startIndex, inorderIndex - 1);
            
        root.right = helper(preorder, inorderMap, inorderIndex + 1, endIndex);    
        
        return root;
        
    }
}
