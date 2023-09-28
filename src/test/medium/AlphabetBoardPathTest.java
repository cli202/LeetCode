package test.medium;

import org.junit.Test;
import main.medium.AlphabetBoardPath;

public class AlphabetBoardPathTest {
    @Test
    public void test1() {
        AlphabetBoardPath alphabetBoardPath = new AlphabetBoardPath();
        System.out.println(alphabetBoardPath.alphabetBoardPath("leet"));
    }

    @Test
    public void test2() {
        AlphabetBoardPath alphabetBoardPath = new AlphabetBoardPath();
        System.out.println(alphabetBoardPath.alphabetBoardPath("zdz"));
    }

    @Test
    public void test3() {
        AlphabetBoardPath alphabetBoardPath = new AlphabetBoardPath();
        System.out.println(alphabetBoardPath.alphabetBoardPath("zz"));
    }

}