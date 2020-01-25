class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int left = 0; left < nums.length; left++) {
            int middle = left + 1;            
            int right = nums.length - 1;
            
            //to avoid the duplicate elements 
            if(left > 0 
               && nums[left] == nums[left - 1]) {
                continue;
            }
            
            while(middle< right) {
                // Teva, ask yourself why is this line here? 
                 //to avoid the duplicate elements 
                if(right < nums.length - 1 
                   && nums[right] == nums[right + 1]) {                    
                    right--;
                    continue;
                }
                
                if(nums[left] + nums[middle] + nums[right] < 0) {
                    middle ++;
                } else if(nums[left] + nums[middle] + nums[right] > 0) {
                    right--;
                } else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[middle]);
                    list.add(nums[right]);
                    result.add(list);
                    middle++;
                    right--;
                }
            }            
        }
        
        return result;
    }
}
