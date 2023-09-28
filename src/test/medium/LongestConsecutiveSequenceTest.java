package test.medium;

import org.junit.Test;
import main.medium.LongestConsecutiveSequence;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class LongestConsecutiveSequenceTest {
    @Test
    public void test1() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = new int[] {100,4,200,1,3,2};
        System.out.println(longestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void test2() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = new int[] {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutiveSequence.longestConsecutive(nums));
    }
}