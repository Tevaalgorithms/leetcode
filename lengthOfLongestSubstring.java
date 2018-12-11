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
    

    public int lengthOfLongestSubstring_method2(String s) 
    {
       int n = s.length();
       int ans = 0;
       Map<Character, Integer> map = new HashMap<>();
       
       for(int i = 0, j = 0; i < n; i++)
       {
           if(map.containsKey(s.charAt(i)))
           {
               j = Math.max(map.get(s.charAt(i)), j);
           }
           ans = Math.max(ans, j - i + 1 );
           map.put(s.charAt(i), j +1);
       }
      return ans;
    }

    
}
