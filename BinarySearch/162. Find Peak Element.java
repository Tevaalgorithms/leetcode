// Teva, here why did NOT change the mid as mid - 1 in the right
class Solution {
    // 1.48 PM
    public int findPeakElement(int[] nums) {
     int left = 0;
     int right = nums.length - 1;
     while(left < right) {
         int mid = left + (right - left) / 2;
         if(nums[mid] < nums[mid + 1])
         {
             left = mid + 1;
         } else {
             right = mid;
         }
     }
     return left;
    }
}
