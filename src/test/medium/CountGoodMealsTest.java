package test.medium;

import org.junit.Test;
import main.medium.CountGoodMeals;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class CountGoodMealsTest {
    @Test
    public void test1() {
        CountGoodMeals countGoodMeals = new CountGoodMeals();
        int[] deliciousness = new int[] {1,3,5,7,9};
        System.out.println(countGoodMeals.countPairs(deliciousness));
    }

    @Test
    public void test2() {
        CountGoodMeals countGoodMeals = new CountGoodMeals();
        int[] deliciousness = new int[] {32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32};
        System.out.println(countGoodMeals.countPairs(deliciousness));
    }
}