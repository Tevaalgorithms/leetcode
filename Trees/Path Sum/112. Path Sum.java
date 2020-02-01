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
    public boolean hasPathSum(TreeNode root, int sum) {
       if(root == null){
           return false;
       }
        
       LinkedList<TreeNode> nodes = new LinkedList<>();
       LinkedList<Integer> sumStack = new LinkedList<>(); 
       
       nodes.add(root);
       sumStack.add(sum - root.val);
        
       int currentSum;
       TreeNode temp;
        
       while(!nodes.isEmpty()) {
           
           temp = nodes.pollLast();
           
           currentSum = sumStack.pollLast();
           
           if((temp.left == null) && (temp.right == null) && (currentSum == 0)){
               return true;
           }
           
           if(temp.left != null) {
                nodes.add(temp.left);
                sumStack.add(currentSum - temp.left.val);
           }
              
           if(temp.right != null) {
                nodes.add(temp.right);
                sumStack.add(currentSum - temp.right.val);
           } 
       }     
    
       return false;           
              
   }
}
