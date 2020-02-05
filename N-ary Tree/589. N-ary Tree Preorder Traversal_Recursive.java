/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    // Root > Left > Right
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }           
        helper(root, result);
        return result;
    }
    
    private void helper(Node root,  List<Integer> result){
        if(root == null) {
            return;
        }
        
        result.add(root.val);
        
        for(Node n: root.children) {
            
            if(n.children == null) {
                return;
            } else {
                helper(n, result);
            }
        }
        return;        
    }
}
