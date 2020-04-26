class Solution {
    public int maxSubArray(int[] nums) {        
      int currentSum = nums[0];
      int globalSum = nums[0];
      for(int i = 1; i < nums.length; i++) {
        currentSum = Math.max(nums[i], currentSum + nums[i]);
        globalSum  = Math.max(currentSum, globalSum);
      }
      return globalSum;  
    }
}
