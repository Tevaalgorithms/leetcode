class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if(nums == null || nums.length == 0) {
            return result;
        }
        List<Integer> subsets = new ArrayList<>();
        helper(0, nums, subsets, result);
        return result;
    }
    
    private void helper(int startIndex, int[] nums, List<Integer> subsets,   List<List<Integer>> result) {
        
        result.add(new ArrayList<>(subsets));
        
        for(int i = startIndex; i < nums.length; i++) {
            if(i > startIndex && nums[i] == nums[i-1]) {
                continue;
            }
            subsets.add(nums[i]);
            helper(i + 1, nums, subsets, result);
            subsets.remove(subsets.size() - 1);          
        }
    }
}
