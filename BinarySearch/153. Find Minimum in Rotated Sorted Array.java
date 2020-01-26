class Solution {
    public int findMin(int[] nums) {
     if(nums == null || nums.length == 0) {
         return -1;
     }
        
     int s = 0;
     int e = nums.length - 1;
        
     while(s <= e) {
         
         int mid = s + (e - s) / 2;
         // Teva why do you need to give > OR "=" here THINK!!!
         if(nums[mid] >= nums[0]){
             s = mid + 1;
         } else {
             e = mid - 1;
         }
     }
     
    if(s == nums.length){
        return nums[0];
    } 
        
    return nums[s];
        
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
