// helpful URL: https://www.youtube.com/watch?v=9lQnt4p7_nE
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      
     List<List<Integer>> result = new ArrayList<>();
     
     if(candidates == null || candidates.length == 0) {
         return result;
     }
     
     Arrays.sort(candidates);
        
     List<Integer> combinations = new ArrayList<Integer>();
    
     findCombinations(candidates, combinations, result, target, 0);
        
     return result;  
        
    } 
    
    private void findCombinations(int[] candidates, List<Integer> combinations, List<List<Integer>> result, int target, int startIndex) {
        if(target == 0) {
            result.add(new ArrayList<>(combinations));
            return;
        }
        
        for(int i = startIndex; i < candidates.length; i++){
            if(i != startIndex && candidates[i] == candidates[i - 1]){
                continue;
            }
            
            if(target < candidates[i]) {
                break;
            }
            
            combinations.add(candidates[i]);
            
            // TEVA, TRY TO THINK QUESTION 40. WHY WE pass HERE i and in the question 40 i + 1 for start Index
            findCombinations(candidates, combinations, result, target-candidates[i], i);
            
            combinations.remove(combinations.size() - 1);
        }
    }
}
