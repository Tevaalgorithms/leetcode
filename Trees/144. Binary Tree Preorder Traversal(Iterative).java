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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        if(root == null) {
            return result;
        }
        
        Stack<TreeNode> st = new Stack<>();
        
        while(true) {
            
            while(root != null) {
                st.push(root);
                result.add(root.val);               
                root = root.left;
            }
            
            if(st.isEmpty()) {
                break;
            }
            
            TreeNode temp = st.pop(); 
            
            root= temp.right;
        }
        
        return result;
    }
    
}
