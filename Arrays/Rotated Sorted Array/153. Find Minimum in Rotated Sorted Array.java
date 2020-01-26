class Solution {
    public int findMin(int[] nums) {
      // Time complexity: O(logn)
      // what is Space complexity, Teva  
      if (nums == null || nums.length == 0)
            return -1;
        
        int left = 0, right = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= nums[0])
                left = mid + 1;
            else
                right = mid - 1;
        }
        
        return left == nums.length ? nums[0] : nums[left];
    }
    
    /* 
      Time complexity: O(n)
      Space complexity: O(n)
      public int findMin(int[] nums) {
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < result) {
                result = nums[i];
            }
        }
        return result;
     }
    */
    
}
