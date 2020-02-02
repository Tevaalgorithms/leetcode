class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}

// Here the idea is that if you do XOR operation for same two numbers it will return 0. So, the one doesn't return 0 would be the number.
