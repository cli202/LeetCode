package test.medium;

import org.junit.Test;
import main.medium.DailyTemperatures;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class DailyTemperaturesTest {
    @Test
    public void test1() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = new int[] {73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures.dailyTemperatures(temperatures));
    }
}