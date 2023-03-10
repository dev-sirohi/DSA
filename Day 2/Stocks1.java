class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < low) {
                low = prices[i];
            }
            
            if (prices[i] - low > max) {
                max = prices[i] - low;
            }
        }
        
        return max;
    }
}
