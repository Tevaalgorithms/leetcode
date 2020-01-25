class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int startIndex = findElemenet(nums, target, 0, nums.length -1, true);
        int endIndex = findElemenet(nums, target, 0, nums.length -1, false);
        result[0] = startIndex;
        result[1] = endIndex;
        return result;
    }
    
    public int findElemenet(int[] input, int num, int startIndex, int endIndex, boolean firstIndex) {
        int result = -1;
        int s = startIndex;
        int e = endIndex;       
        while(s <= e) {    
            int mid = s + (e - s) / 2;
            if(input[mid] == num) {
                if(firstIndex) {
                   // I am searching in the LEFT SIDE 
                   result = mid; 
                   e = mid - 1; 
                } else {
                   // I am searching in the RIGHT side 
                   result = mid; 
                   s = mid + 1;                     
                }                
            } else if (input[mid] < num) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return result;
    }
}
