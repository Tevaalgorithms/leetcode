class Solution {
    public boolean isValid(String s) {
  
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            } else {
                if(!st.isEmpty()) {
                    char src = st.pop();
                    char dst = s.charAt(i);
                    if(!checkValid(src, dst)){
                        return false;
                    }
                } else {
                   // here is the case for strings like this as starting "]"
                   return false;  
                }               
            }
        }
        
        // Here I am checking is there any empty open brackets are in the stack
        if(!st.isEmpty()){
            return false;
        } else {
            return true;
        }        
    }
    
    public boolean checkValid(char src, char dst){
        if((src == '(' && dst == ')') || (src == '[' && dst == ']') || (src=='{' && dst == '}') ){
            return true;
        }
        return false;
    }
}
