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
        LinkedList<Integer> result = new LinkedList<>();
        LinkedList<Node> stack = new LinkedList<>();
        if(root == null) {
            return result;
        }          
        stack.add(root);
        while(!stack.isEmpty()) {
            Node node = stack.pollLast();
            result.add(node.val);
            Collections.reverse(node.children);
            for(Node item: node.children) {
                stack.add(item);
            }
        }
        return result;
    }
}
