class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 && k == 0) {
            int[] empty = new int[]{};
            return empty;
        }
        
        Deque<Integer> dequeue = new LinkedList<Integer>();
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int i;
        
        for(i = 0; i < k; i++) {
            while((!dequeue.isEmpty()) && nums[i] >= nums[dequeue.peekLast()]) {
                dequeue.removeLast();
            }
            dequeue.addLast(i);
        }
        
        for(; i < nums.length ; i++) {
            result.add(nums[dequeue.peek()]);
            
            while((!dequeue.isEmpty()) && dequeue.peek() <= i - k) {
                 dequeue.removeFirst();
            }
            
            while((!dequeue.isEmpty()) && nums[i] >= nums[dequeue.peekLast()]) {
                 dequeue.removeLast();
            }
            
            dequeue.addLast(i);
        }
        
        result.add(nums[dequeue.peek()]);
        
        int[] finalResult = new int[result.size()] ;
        
        for(int j = 0; j < result.size(); j++) {
            finalResult[j] = result.get(j);
        }
        
        return finalResult;
    }
}
