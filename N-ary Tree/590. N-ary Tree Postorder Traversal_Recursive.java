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
    public List<Integer> postorder(Node root) {
        List<Integer> result = new LinkedList<>();
        if(root == null) {
            return result;
        }
        helper(root, result);
        return result;
    }
    
    // Post Order : Left > Right > Root
    private void helper(Node root, List<Integer> result) {
        if(root == null) {
            return;
        }
        for(Node n: root.children) {
            if(n.children == null){
                result.add(n.val);
            } else {
                helper(n, result);               
            }
        }
        result.add(root.val);
        return;
        
    }
}
