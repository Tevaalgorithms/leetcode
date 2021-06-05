class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 0)
            return nums.length;
        
        int i = 0; int j = 0;
        
        while(++j < nums.length) {
            if(nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        
        return i + 1;
    }
}

// Space Complexity: O(1)
// Time Complexity: O(n)
