class Solution {
    public boolean backspaceCompare(String S, String T) {
        String cleanString1 = cleanString(S);
        String cleanString2 = cleanString(T);
        return compareString(cleanString1, cleanString2);
    }
    
    private String cleanString(String st1) {
        
        Stack<Character> st = new Stack<>();  
        
        for(int i = 0 ; i < st1.length(); i++) {
            Character s1 = st1.charAt(i);
            if(!s1.equals('#')) {
             st.push(s1); 
            } else {
                if(!st.isEmpty()){
                    st.pop();
                }
            } 
        }
       
        StringBuilder sb = new StringBuilder();
            
        while(!st.isEmpty()){
            sb.append(st.pop());            
        }
        
        return sb.toString();  
    }
    
    private boolean compareString(String st1, String st2) {
        int s1Length = st1.length();
        
        int s2Length = st2.length();
        
        if(s1Length != s2Length) {
            return false;
        }
        
        for(int i = 0; i < s1Length; i++) {
            if(st1.charAt(i) != st2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
