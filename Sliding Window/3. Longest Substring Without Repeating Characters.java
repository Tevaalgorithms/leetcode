class Solution {
    public int lengthOfLongestSubstring(String s) {
      int i = 0;
      int j = 0;
      int ans = 0;
      int n = s.length();
      HashSet<Character> hs = new HashSet<>();
        
      while(i < n && j < n) {
          if(!hs.contains(s.charAt(j))) {
              hs.add(s.charAt(j++));            
              ans = Math.max(ans, j - i);
          }
          else {
              hs.remove(s.charAt(i++));             
          }
      }
      return ans;        
    }
}
