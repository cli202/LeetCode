package test.medium;

import org.junit.Test;
import main.medium.ThreeSum;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class ThreeSumTest {
    @Test
    public void test1() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        System.out.println(threeSum.threeSum(nums));
    }
}