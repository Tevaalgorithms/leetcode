class Solution {
     public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length == 0) {
            return numbers;
        }
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        while(end > start) {
            if(numbers[start] + numbers[end] == target) {
               result[0] = start + 1;
               result[1] = end + 1; 
               return result; 
            } else if(numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }            
        }
        throw new IllegalArgumentException("No two sum numbers found");
    }
}

// What is Time Complexity: Each element needs to be visited at least once
// O(N)

// Space complexity: 
// We only uses two indicies 
// O(1)
