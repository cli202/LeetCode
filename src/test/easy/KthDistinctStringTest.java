package test.easy;

import org.junit.Test;
import main.easy.KthDistinctString;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class KthDistinctStringTest {
    @Test
    public void test1() {
        KthDistinctString kthDistinctString = new KthDistinctString();
        String[] arr = new String[] {"d","b","c","b","c","a"};
        System.out.println(kthDistinctString.kthDistinct(arr, 2));
    }
}