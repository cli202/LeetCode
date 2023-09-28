package main.easy;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = 0;
        int r = 1;
        while (r < prices.length) {
            max = Math.max(max, prices[r] - prices[l]);
            if (prices[l] > prices[r]) {
                l = r;
                r++;
            } else {
                r++;
            }
        }
        return Math.max(max, prices[r - 1] - prices[l]);
    }
}
