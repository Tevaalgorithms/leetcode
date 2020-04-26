class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int length1 = text1.length();
        int length2 = text2.length();
        
        int[][] M = new int[length1+1][length2+1];
        
        M[0][0] = 0;
        
        // Build the table using bottom up approach
        for(int i = 1; i <= length1; i++)
        {
            for(int j = 1; j <= length2; j++)
            {   
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                    M[i][j]  =  M[i-1][j-1] + 1;
                }
                else
                {
                   M[i][j] = Math.max(M[i-1][j], M[i][j-1]);
                }                
            }
        }
        
        return M[length1][length2];
    }
}
