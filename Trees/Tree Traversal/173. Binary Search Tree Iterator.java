/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    
    Queue<Integer> nodes;

    public BSTIterator(TreeNode root) {
       nodes = new LinkedList<>(); 
       helper(root, nodes);
    }
    
    private void helper(TreeNode root, Queue<Integer> nodes) {
        if(root == null) {
            return;
        }
        helper(root.left, nodes);
        nodes.add(root.val);
        helper(root.right, nodes);
    }
    
    
    
    /** @return the next smallest number */
    public int next() {
       return nodes.remove();
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(nodes.isEmpty())
            return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
