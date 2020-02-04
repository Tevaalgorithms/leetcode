/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "null,";
        }
        
        return seralizehelper(root, "");
    }
    
    private String seralizehelper(TreeNode root, String str) {
        if(root == null) {
            
            str += "null,";
            
        } else {
            
            str += str.valueOf(root.val) + ",";
            
            str = seralizehelper(root.left, str);
            
            str = seralizehelper(root.right, str);
        }
        
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
     String[] input = data.split(",");
        
     List<String> al = new LinkedList<String>(Arrays.asList(input));
        
     return deserializeHelper(al);
        
    }
    
    private TreeNode deserializeHelper(List<String> al) {        
        if(al.get(0).equals( "null")) {
          al.remove(0);
          return null;
        } 
        TreeNode root = new TreeNode(Integer.valueOf(al.get(0)));
        al.remove(0);
        root.left = deserializeHelper(al);
        root.right = deserializeHelper(al);      
        return root;        
    }
    
     
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
