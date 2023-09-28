package test.easy;

import main.easy.TwoSum;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void test1() {
        TwoSum twoSum = new TwoSum();
        int[] array = new int[]{2,7,11,1};

        int[] result = twoSum.twoSum(array, 9);
        for (int num: result) {
            System.out.println(num);
        }
    }
}