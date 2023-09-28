package main.medium;

import java.util.*;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        int prev = nums[0];
        int curr = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev + 1) {
                curr++;
            } else if (nums[i] == prev) {
                //do nothing
            } else {
                max = Math.max(max, curr);
                curr = 1;
            }
            prev = nums[i];
        }
        return Math.max(curr, max);
    }
}
