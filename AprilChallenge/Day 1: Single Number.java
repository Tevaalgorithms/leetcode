class Solution {
    public int singleNumber(int[] nums) {
      int result = 0;
      for(int i = 0; i < nums.length; i++) {
          result ^= nums[i];
      }  
      return result;  
    }
}

/*
XOR:
1 XOR 1 : 0
1 XOR 0 : 1
--------------
2,2,1

result = 0;

result = 0 XOR 2 (2)

result = 2 XOR 2 (0)

result = 0 XOR 1 (1)

*/

// Time Complexity: O(N)
// Space Complexity: O(1)
