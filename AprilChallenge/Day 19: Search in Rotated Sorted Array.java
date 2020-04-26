class Solution {
    
    public int search(int[] nums, int target) {
       if(nums == null || nums.length == 0) {
            return -1;
        }
        if(nums.length == 1){
            return (nums[0] == target) ? 0 : -1;
        } 
        
        int pivot = findPivot(nums); 
        
        if(nums[pivot] == target) {
            return pivot;
        } else if(pivot == 0) {
            return binarySearch(nums, target, 0, nums.length - 1);
        } else if(nums[0] > target) {
            // Search in left side
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        } else {
            // serach in right side
             return binarySearch(nums, target, 0, pivot - 1);
        }  
    }
    
   // To get the pivot index
    private int findPivot(int[] nums) {
       int low = 0;
       int high = nums.length - 1;       
       while(low < high) {
           int mid = low + (high - low) / 2;
           if(nums[mid] < nums[high]) {
               // Case: 1 Here the pivot should be in the left handside 
               // NOTE: here I am not increasing the mid index bcz it could be pivot too
               high = mid;
           } else if(nums[mid] > nums[high]) {
               // Case: 2 here the pivot should be in the right handside 
               // As you see here I am increasing the index of mid bcz we know that mid is NOT pivot in this case
               low = mid + 1;
           } else {
               // Case: 3 Here the nums[pivot] == nums[high]
               // So, we are reducing the high by one
               high -= 1;
           }
       }       
        return low;       
    }
    
    private int binarySearch(int[] nums, int target, int s, int e){       
        while(s <= e) {
            int mid = s + (e - s) / 2;           
            if(target == nums[mid]) {
                // Case 1: Found the element
                return mid;
            } else if(target < nums[mid]) {
                // Case 2: In this case we need to look in the right hand side
                e = mid - 1;
            } else {
                // Case 3: In this case we need to look in the left hand side
                s = mid  + 1;
            }     
        }
        return -1;    
    }

}
