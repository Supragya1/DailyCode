// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        int[] rigthmin = new int[prices.length];
        int profit = 0;

        rigthmin[0] = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (i != 0)
            rigthmin[i] = (int)Math.min(rigthmin[i-1], prices[i]);
            profit = Math.max(profit, prices[i] - rigthmin[i]);
        }

        return profit;
    } 
}