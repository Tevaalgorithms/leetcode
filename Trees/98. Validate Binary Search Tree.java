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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        InOrder(root, result);
        for(int i = 0; i < result.size() - 1; i++) {
            if(result.get(i) >= result.get(i+1)){
                return false;
            }
        }
        return true;
    }
    
    // method 1: Traverse the tree in InOrder (Left > Root > Right)
    
    public void InOrder(TreeNode root, ArrayList<Integer> result){
        if(root == null) return;
        InOrder(root.left, result);
        result.add(root.val);
        InOrder(root.right, result);
    }
}
