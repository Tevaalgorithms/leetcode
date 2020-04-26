class Solution {
    public int lastStoneWeight(int[] stones) {
        
        if(stones == null) {
            return 0;
        }
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder()); 
        
        for(int i = 0; i < stones.length; i++) {
            pQueue.add(stones[i]);
        }
        
        while(pQueue.size() > 1) {
            int first = pQueue.poll();
            int second = pQueue.poll();
            if(first != second) {
                int diff = Math.abs(first-second);
                pQueue.add(diff);
            }
        }
        
        return pQueue.size()==1 ? pQueue.poll() : 0;       
    }
}
