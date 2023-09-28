package main.medium;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class LongestSequenceReplacement {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int max = 0;
        int l = 0;
        int r = 0;
        int maxFreq = 0;
        while (r < s.length()) {
            maxFreq = Math.max(maxFreq, ++count[s.charAt(r) - 65]);
            if (r - l + 1 - maxFreq > k) {
                count[s.charAt(l++) - 65]--;
            }
            max = Math.max(max, r - l + 1);
            r++;
        }
        return Math.min(s.length(), max);
    }
}
