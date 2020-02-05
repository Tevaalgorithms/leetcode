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
       LinkedList<Node> st = new LinkedList<>();
       LinkedList<Integer> result = new LinkedList<>();
       if(root == null)  {
           return result;
       }
       st.add(root);
       while(!st.isEmpty()) {
           Node temp = st.pollLast();
           result.addFirst(temp.val);
           for(Node n: temp.children){
               if(n != null){
                   st.add(n);
               }
           }
       }
       return result; 
    }
    
  
}
