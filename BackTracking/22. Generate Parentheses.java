class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> output_array = new ArrayList<>();
        
        backtrack(output_array, "", 0, 0, n);
        
        return output_array;
    }
    
    public void backtrack(List<String> output_array, String currentString, int open, int close, int max) {
        if(currentString.length() == max * 2) {
            output_array.add(currentString);
            return;
        }
        
        if(open < max) {
            backtrack(output_array, currentString + "(" , open + 1, close, max);     
        }
        
        if(close < open) {
            backtrack(output_array, currentString + ")" , open, close + 1, max);
        }
    }
}
