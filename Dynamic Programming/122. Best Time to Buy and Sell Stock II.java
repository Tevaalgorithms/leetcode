// Teva think about this test case: [7,1,4,5,6,4]

class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
       for(int i = 1; i < prices.length; i++ ) {
           if(prices[i] > prices[i - 1]) {
              maxProfit += prices[i] - prices[i - 1]; 
           }
       }
        return maxProfit;
    }
}
