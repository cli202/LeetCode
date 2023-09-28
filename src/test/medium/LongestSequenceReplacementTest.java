package test.medium;

import org.junit.Test;
import main.medium.LongestSequenceReplacement;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class LongestSequenceReplacementTest {
    @Test
    public void test1() {
        LongestSequenceReplacement longestSequenceReplacement = new LongestSequenceReplacement();
        System.out.println(longestSequenceReplacement.characterReplacement("ABAB", 2));
    }

    @Test
    public void test3() {
        LongestSequenceReplacement longestSequenceReplacement = new LongestSequenceReplacement();
        System.out.println(longestSequenceReplacement.characterReplacement("AABABBA", 1));
    }

    @Test
    public void test2() {
        LongestSequenceReplacement longestSequenceReplacement = new LongestSequenceReplacement();
        System.out.println(longestSequenceReplacement.characterReplacement("ABBB", 2));
    }
}