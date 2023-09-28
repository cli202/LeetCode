package test.medium;

import org.junit.Test;
import main.medium.FindArrayGameWinner;

public class FindArrayGameWinnerTest {
    @Test
    public void test1() {
        int[] arr = new int[] {2,1,3,5,4,6,7};
        FindArrayGameWinner findArrayGameWinner = new FindArrayGameWinner();

        System.out.println(findArrayGameWinner.getWinner(arr, 2));
    }

    @Test
    public void test2() {
        int[] arr = new int[] {2,1,3,7,4,6,5};
        FindArrayGameWinner findArrayGameWinner = new FindArrayGameWinner();

        System.out.println(findArrayGameWinner.getWinner(arr, 6));
    }
}