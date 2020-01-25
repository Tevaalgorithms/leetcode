class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combinations = new ArrayList<>();
        helper(n, k, 1, combinations, result);
        return result;
    }
    
    private void helper(int n, int k, int startIndex,  List<Integer> combinations, List<List<Integer>> result) {
        if(combinations.size()==k){
            result.add(new ArrayList<>(combinations));
            return;
        }
        
        for(int i = startIndex; i <= n; i++){
            combinations.add(i);
            helper(n, k, i + 1, combinations, result);
            combinations.remove(combinations.size() - 1);
        }        
    }
}
