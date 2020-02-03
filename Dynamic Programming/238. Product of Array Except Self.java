class Solution {
    /*
    input:              [2, 3, 4, 5, 6]
      
    intermediate steps: 
            Left Array: [1, 2, 6, 24, 120]
            
            Right Array:[360, 120, 30, 6, 1]
            
    output:             [360, 240, 180, 144, 120]
    */
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        if(nums==null || nums.length == 0) {
            return result;
        }
        
        int[] left = new int[nums.length];
        
        int[] right = new int[nums.length];            
        
        left[0] = 1;        
        for(int i = 1 ; i < nums.length ; i++) {
           left[i] =  left[i - 1] * nums[i - 1];
        }
        
        right[nums.length - 1] = 1;
        for(int j = nums.length - 2; j >=0; j--) {
          right[j] = right[j + 1]  * nums[j + 1];
        }
        
        for(int i = 0; i < nums.length; i++) {
           result[i] =   left[i] * right[i]; 
        }
        
        return result;
        
    }
}
