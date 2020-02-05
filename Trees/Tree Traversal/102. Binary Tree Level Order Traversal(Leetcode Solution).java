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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<>();        
        q.add(root);
        
        while(!q.isEmpty()) {
            List<Integer> levels = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode temp = q.remove();
                levels.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            result.add(levels);         
        }        
        return result;
    }
}
