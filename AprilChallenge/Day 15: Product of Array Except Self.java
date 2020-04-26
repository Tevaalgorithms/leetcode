class Solution {
    public int[] productExceptSelf(int[] nums) {
     int[] result = new int[nums.length];
     
     // Product of right to left   
     result[result.length - 1] = 1;
     for(int j = result.length - 2; j >= 0 ; j--) {
       result[j] = result[j + 1] * nums[j + 1];
     }       
   
        
     // Product of left to right
    int temp = 1;
    for(int k = 0; k < result.length; k++)  {
      result[k] = temp * result[k];
      temp = temp * nums[k];
    }  
      
     return result;
    }                  
}

/*
     First For Loop
     =============
     
     nums:    [1,   2, 3, 4]
     result:  [24 ,12 , 4, 1]     
    

     Second For Loop
     ================
     k = 0
     temp = 1
     nums:    [1,   2, 3, 4]
     result:  [24 ,12 , 4, 1]  
     temp =  1 * nums[0] = 1 * 1= 1
     k = 1
     temp = 1
     nums:    [1,   2, 3, 4]
     result:  [24 ,12 , 4, 1]  
     temp =  1 * nums[1] = 1 * 2= 2
     k = 2
     temp = 2
     nums:    [1,   2, 3, 4]
     result:  [24 ,12 , 8, 1]  
     temp =  2 * nums[2] = 2 * 3= 6
     k = 3
     temp = 6
     nums:    [1,   2, 3, 4]
     result:  [24 ,12 , 8, 6]  
     temp =  6 * nums[3] = 6 * 4 = 24    

*/
