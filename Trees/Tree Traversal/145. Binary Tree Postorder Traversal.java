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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        if(root == null) {
            return result;
        }
             
        Stack<TreeNode> st = new Stack<>();
        
        st.push(root);
        
        while(!st.isEmpty()) {
            TreeNode current = st.pop();
            result.add(0, current.val);
            if(current.left != null){
                st.push(current.left);
            }
            if(current.right != null) {
                st.push(current.right);
            }            
        }
        
        return result;
    }
}
