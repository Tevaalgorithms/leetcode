class FirstUnique {  
    // This will maintain the order
    LinkedHashSet<Integer> uniq;
    // this doesn't maintain the order
    HashSet<Integer> dup;
    
    public FirstUnique(int[] nums) {    
      dup = new HashSet<Integer>();        
      uniq = new LinkedHashSet<Integer>();
        
      for(int i = 0; i < nums.length; i++) {
         addtoUniq(nums[i]);          
      }
        
   }    
    
    public int showFirstUnique() {
     if(uniq.isEmpty()) {
         return -1;
     }         
     for(int num: uniq){
         return num;
     }
     return -1;        
    }    
    
    public void add(int value) {
       addtoUniq(value);
    }
    
    private void addtoUniq(int num) {
        if(!uniq.contains(num) && !dup.contains(num)) {
            uniq.add(num);
         } else {
           if(uniq.contains(num)) {
                uniq.remove(num);
                dup.add(num);
            }
         }
    }
    
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
