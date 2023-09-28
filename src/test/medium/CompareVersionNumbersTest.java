package test.medium;

import org.junit.Test;
import main.medium.CompareVersionNumbers;

public class CompareVersionNumbersTest {
    @Test
    public void test1() {
        CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
        System.out.println(compareVersionNumbers.compareVersion("1.01", "1.001"));
    }

    @Test
    public void test2() {
        CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
        System.out.println(compareVersionNumbers.compareVersion("1.0", "1.0.0"));
    }

    @Test
    public void test3() {
        CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
        System.out.println(compareVersionNumbers.compareVersion("0.1", "1.1"));
    }

    @Test
    public void testEdgeCase1() {
        CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
        System.out.println(compareVersionNumbers.compareVersion("1.0.1", "1"));
    }

    @Test
    public void testEdgeCase2() {
        CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
        System.out.println(compareVersionNumbers.compareVersion("1", "0"));
    }

}