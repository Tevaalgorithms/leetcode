class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        
        for(int i = 1; i <= nums.length; i++){
            if(!hs.contains(i)){
                return i;                
            }
        }
        
        return nums.length + 1;
    }
}
