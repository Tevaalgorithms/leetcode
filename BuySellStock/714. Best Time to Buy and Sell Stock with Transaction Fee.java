class Solution {
    public int maxProfit(int[] prices, int fee) {
        int cashIn = 0; 
        int cashOut = -prices[0];
        
        for(int i=1; i<prices.length; i++) {
          cashIn = Math.max(cashIn, cashOut + prices[i] - fee);
          cashOut = Math.max(cashOut, cashIn - prices[i]) ;
        }
        return cashIn;
    }
}
