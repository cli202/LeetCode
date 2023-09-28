package test.easy;

import org.junit.Test;
import main.easy.DecryptStringFromAlphabet;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class DecryptStringFromAlphabetTest {
    @Test
    public void test1() {
        DecryptStringFromAlphabet decryptStringFromAlphabet = new DecryptStringFromAlphabet();
        System.out.println(decryptStringFromAlphabet.freqAlphabets("10#11#12"));
    }

    @Test
    public void test2() {
        DecryptStringFromAlphabet decryptStringFromAlphabet = new DecryptStringFromAlphabet();
        System.out.println(decryptStringFromAlphabet.freqAlphabets("1326#"));
    }


}