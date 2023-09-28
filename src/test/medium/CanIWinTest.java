package test.medium;

import org.junit.Test;
import main.medium.CanIWin;

public class CanIWinTest {
    @Test
    public void test1() {
        CanIWin canIWin = new CanIWin();
        System.out.println(canIWin.canIWin(10, 11));
    }

    @Test
    public void test2() {
        CanIWin canIWin = new CanIWin();
        System.out.println(canIWin.canIWin(10, 1));
    }

    @Test
    public void test3() {
        CanIWin canIWin = new CanIWin();
        System.out.println(canIWin.canIWin(4, 6));
    }
}