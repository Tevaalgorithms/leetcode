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
    public TreeNode bstFromPreorder(int[] preorder) {
       if(preorder == null || preorder.length == 0) {
           return null;
       }
        
       TreeNode root = new TreeNode(preorder[0]);
        
       Stack<TreeNode> st = new Stack<>();
        
       st.push(root);
        
       for(int i = 1; i < preorder.length; i++)  {
           
           TreeNode temp = null;
           
           while(!st.isEmpty() && st.peek().val < preorder[i]) {
               temp = st.pop();
           }
           
           if(temp != null) {
               temp.right = new TreeNode(preorder[i]);
               st.push(temp.right);
           } else {
               temp = st.peek();
               temp.left = new TreeNode(preorder[i]);
               st.push(temp.left);
           }
       }
        
      return root;        
    }
  
}
