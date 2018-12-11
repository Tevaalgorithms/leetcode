class LengthOfLongestSubstring {
    
    public int lengthOfLongestSubstring_method1(String s) 
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
  
    public int lengthOfLongestSubstring(String s) 
    {
      int n = s.length(), ans = 0;
      Map<Character, Integer> map = new HashMap<>(); // current index of character
      // try to extend the range [i, j]
       for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            // Why (j - i + 1) ????
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }


    
}
