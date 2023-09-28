package test.medium;

import org.junit.Test;
import main.medium.TwoSum2;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class TwoSum2Test {
    @Test
    public void test1() {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] nums = new int[] {-1, 0};
        int[] result = twoSum2.twoSum(nums, -1);
        System.out.println(result[0] + " " + result[1]);
    }

    @Test
    public void test2() {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] nums = new int[] {0,0,3,4};
        int[] result = twoSum2.twoSum(nums, 0);
        System.out.println(result[0] + " " + result[1]);
    }

    @Test
    public void test3() {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] nums = new int[] {-3,3,4,90};
        int[] result = twoSum2.twoSum(nums, 0);
        System.out.println(result[0] + " " + result[1]);
    }

    @Test
    public void test4() {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] nums = new int[] {-1,-1,1,1};
        int[] result = twoSum2.twoSum(nums, -2);
        System.out.println(result[0] + " " + result[1]);
    }
}