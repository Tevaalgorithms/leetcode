// Help: https://www.youtube.com/watch?v=j9_qWJClp64
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();       
        
        if(candidates == null || candidates.length == 0) {
            return result;
        }
        
         // Here we are soring to get smaller elements to come first in DFS
        Arrays.sort(candidates);
        
        List<Integer> combinations = new ArrayList<>();
        
        toFindCombinations(candidates, target, result, combinations, 0);
        
        return result;
    }
    
    private void toFindCombinations(int[] candidates, int target, List<List<Integer>> result, List<Integer> combinations, int startIndex) {
        
        if(target == 0){
            // Note: Here we need to do a deep copy
            result.add(new ArrayList<>(combinations));
            return;
        }
        
        for(int i = startIndex; i < candidates.length; i++) {
            // We don't need to do the same elements twice 
            if(i != startIndex && candidates[i] == candidates[i - 1]){
                continue;
            }
            
            if(candidates[i] > target){
                break;
            }
            
            combinations.add(candidates[i]);
            
            toFindCombinations(candidates, target - candidates[i], result, combinations, i + 1);
            
            combinations.remove(combinations.size() - 1);
        }
    }
    
}
