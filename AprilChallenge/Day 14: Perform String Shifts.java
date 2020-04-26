class Solution {
    public String stringShift(String s, int[][] shift) {       
        int len = shift.length;        
        int shiftcount = 0;        
        for(int i = 0; i < len; i++) {            
            int numberofChar = shift[i][1];                        
            if(shift[i][0] == 1) {
                // l : right shift
                shiftcount += numberofChar;                
            } else {
                // 0 : left shift
                shiftcount -= numberofChar;
            }
        }
        
        if(shiftcount == 0) {
            // return the string
            return s;
        } else {
           
            if(shiftcount < 0) {
                // Perform left shift for shiftcount characters  
                // A left shift by 1 means remove the first character of s and append it to the end.  
                shiftcount = Math.abs(shiftcount);
                
                if(shiftcount > s.length()) {
                    shiftcount = shiftcount % s.length();
                }
                
                String leftFirstPartString = s.substring(shiftcount);
                String leftSecondPartString = s.substring(0, shiftcount);
                return leftFirstPartString + leftSecondPartString;                 

            } else {
                // perform right shift for shiftcount characters
                // A right shift by 1 means remove the last character of s and add it to the beginning.
                if(shiftcount > s.length()) {
                    shiftcount = shiftcount % s.length();
                }
                String rightFirstPartString = s.substring(s.length() - shiftcount);
                String rightSecondPartString = s.substring(0, s.length() - shiftcount);               
                return rightFirstPartString +  rightSecondPartString;  
            }
        }        
    }
}
