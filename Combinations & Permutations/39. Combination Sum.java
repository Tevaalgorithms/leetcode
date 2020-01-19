// helpful URL: https://www.youtube.com/watch?v=9lQnt4p7_nE
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>results = new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates, target, 0, new ArrayList<Integer>(), results);
        return results;
    }
    
    private void combination(int[] candidates, 
                             int target, 
                             int index,
                             ArrayList<Integer> current,  
                             List<List<Integer>>results) {
        if(target == 0) {
            results.add(new ArrayList<Integer>(current));
            return;
        }
        
        if(target < 0) {
            return;
        }
        
        for(int i = index; i < candidates.length; i++) {          
                if(candidates[i] > target){
                    return;
                }
                current.add(candidates[i]);
                combination(candidates, target - candidates[i], i, current, results);
                current.remove(current.size() - 1);
          
        }
    }
}
