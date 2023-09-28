package test.medium;

import org.junit.Test;
import main.medium.CountAndSay;

public class CountAndSayTest {
    @Test
    public void CountAndSayTest1() {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(1));
    }

    @Test
    public void CountAndSayTest2() {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(2));
    }
    @Test
    public void CountAndSayTest4() {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(4));
    }
}