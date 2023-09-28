package test.easy;

import org.junit.Test;
import main.easy.BuyAndSellStock;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class BuyAndSellStockTest {
    @Test
    public void test1() {
        BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
        int[] prices = new int[] {2,1,2,1,0,1,2};
        System.out.println(buyAndSellStock.maxProfit(prices));
    }
}