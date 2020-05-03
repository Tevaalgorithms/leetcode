class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> hs = new HashSet<>();
        for(int k=0; k < J.length(); k++){
            hs.add(J.charAt(k));
        }
        
        int count = 0;
        
        for(int k=0; k < S.length(); k++) {
           if(hs.contains(S.charAt(k))) {
                count++;
           }            
        }
        
        return count;
        
        }
       
    }
