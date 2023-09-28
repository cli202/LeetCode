package test.medium;

import org.junit.Test;
import main.medium.SubsequenceWithLargestEvenSum;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class SubsequenceWithLargestEvenSumTest {
    @Test
    public void test1() {
        SubsequenceWithLargestEvenSum subsequenceWithLargestEvenSum = new SubsequenceWithLargestEvenSum();
        int[] nums = new int[] {4,1,5,3,1};
        System.out.println(subsequenceWithLargestEvenSum.largestEvenSum(nums, 3));
    }

    @Test
    public void test2() {
        SubsequenceWithLargestEvenSum subsequenceWithLargestEvenSum = new SubsequenceWithLargestEvenSum();
        int[] nums = new int[] {1,5,5,5,4};
        System.out.println(subsequenceWithLargestEvenSum.largestEvenSum(nums, 4));
    }

}