package test.medium;

import org.junit.Test;
import main.medium.SmallestMissingInt;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class SmallestMissingIntTest {
    @Test
    public void test1() {
        SmallestMissingInt smallestMissingInt = new SmallestMissingInt();
        int[] nums = new int[] {3,0,3,2,4,2,1,1,0,4};
        System.out.println(smallestMissingInt.findSmallestInteger(nums, 5));
    }

    @Test
    public void test2() {
        SmallestMissingInt smallestMissingInt = new SmallestMissingInt();
        int[] nums = new int[] {0, -3};
        System.out.println(smallestMissingInt.findSmallestInteger(nums, 4));
    }

    @Test
    public void test3() {
        SmallestMissingInt smallestMissingInt = new SmallestMissingInt();
        int[] nums = new int[] {1,-10,7,13,6,8};
        System.out.println(smallestMissingInt.findSmallestInteger(nums, 5));
    }
}