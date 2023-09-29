package test.medium;

import org.junit.Test;
import main.medium.BasicCalculator2;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class BasicCalculator2Test {
    @Test
    public void test1() {
        BasicCalculator2 basicCalculator2 = new BasicCalculator2();
        System.out.println(basicCalculator2.calculate("3+2*2"));
    }
    @Test
    public void test2() {
        BasicCalculator2 basicCalculator2 = new BasicCalculator2();
        System.out.println(basicCalculator2.calculate(" 3+5 / 2 "));
    }
    @Test
    public void test3() {
        BasicCalculator2 basicCalculator2 = new BasicCalculator2();
        System.out.println(basicCalculator2.calculate("0-2147483647"));
    }

}