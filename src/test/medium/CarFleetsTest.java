package test.medium;

import org.junit.Test;
import main.medium.CarFleets;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class CarFleetsTest {
    @Test
    public void test1() {
        CarFleets carFleets = new CarFleets();
        int[] position = new int[] {10,8,0,5,3};
        int[] speed = new int[] {2,4,1,1,3};
        System.out.println(carFleets.carFleet(12, position, speed));
    }

    @Test
    public void test2() {
        CarFleets carFleets = new CarFleets();
        int[] position = new int[] {8,3,7,4,6,5};
        int[] speed = new int[] {4,4,4,4,4,4};
        System.out.println(carFleets.carFleet(12, position, speed));
    }
}