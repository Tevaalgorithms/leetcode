class Solution {
    public int maxProfit(int[] prices) {  
      /*
      I need to buy a stop in a cheap price day 
      See the stop after that day when the price is high
      */
     // Step 1: Find the next largest element from each index
     int maxProfit = 0;
     for(int i = 0; i < prices.length; i++) {
         int nextLarget = getNextLargest(prices, i);
         if(nextLarget > prices[i]) {
            maxProfit = Math.max(maxProfit, nextLarget - prices[i]);
         }         
     }
     return maxProfit;  
    }
    
    private int getNextLargest(int[] prices, int index){
        int max = Integer.MIN_VALUE;
        for(int i = index + 1; i < prices.length; i++){
            max = Math.max(prices[i], max);
        }
        return max;
    }
}
