class Solution {
    public int findMin(int[] nums) {
       int low = 0;
       int high = nums.length - 1;
       while(low < high) {
           int mid = low + (high - low) / 2;
           if(nums[mid] < nums[high]) {
               high = mid;
           } else if(nums[mid] > nums[high]) {
               low = mid + 1;
           } else {
               high -= 1;
           }           
       }
       return nums[low]; 
    }
    
    
    
    //  public int findMin(int[] nums) {
    //     int result = Integer.MAX_VALUE;
    //     for(int i = 0; i < nums.length; i++) {
    //         if(nums[i] < result) {
    //             result = nums[i];
    //         }
    //     }
    //     return result;
    // }
    
   
}
