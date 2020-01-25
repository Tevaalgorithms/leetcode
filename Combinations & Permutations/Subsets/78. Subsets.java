class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return result;
        }
        List<Integer> subsets = new ArrayList<>();
        helper(0, nums, subsets, result);
        return result;
    }
    
    private void helper(int startIndex, int[] nums,List<Integer> subsets, List<List<Integer>> result) {
        
        result.add(new ArrayList<>(subsets));
        
        for(int i = startIndex; i < nums.length; i++){
            subsets.add(nums[i]);
            helper(i + 1, nums, subsets, result);
            subsets.remove(subsets.size() - 1);          
        }
    }
}
