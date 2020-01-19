class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(candidates, 0, target, new ArrayList<Integer>(), results);
        return results;        
    }
         
    private void combinationSum(int[] candidates, int index, int target, ArrayList<Integer> current,  List<List<Integer>> results) {
        if(target == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        
        if(target < 0) {
            return;
        }
        
        for(int i = index; i < candidates.length; i++) {
            if(i == index || candidates[i] != candidates[i - 1]){
                current.add(candidates[i]);
                combinationSum(candidates, i + 1, target - candidates[i], current, results);
                current.remove(current.size() - 1);
            }
        }
    }
    
}
