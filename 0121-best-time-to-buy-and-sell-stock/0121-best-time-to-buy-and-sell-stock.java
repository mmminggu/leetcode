class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int result = 0;

        for(int i=1; i<prices.length; i++){
            int profit = prices[i] - min;

            if(min > prices[i]){
                min = prices[i];
            }
            if(result < profit){
                result = profit;
            }
            
        }
        return result;
    }
}