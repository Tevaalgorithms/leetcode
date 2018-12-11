class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int ans = 0;
        int[] ascii_char = new int[128];
        for(int i = 0, j = 0; i < n; i++)
        {
            j = Math.max(ascii_char[s.charAt(i)], i);
            ans = Math.max(ans, j - i + 1);
            ascii_char[i] = j + 1;
        }
        return ans;
    }
}
