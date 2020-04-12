class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int currentSum = nums[0];
        int globalSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            globalSum = Math.max(globalSum, currentSum);
        }
        return globalSum;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
