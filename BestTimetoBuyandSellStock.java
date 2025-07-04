class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxprofit = 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            profit = prices[i] - min;
            maxprofit = Math.max(profit, maxprofit);
        }
        return maxprofit;
    }
}
