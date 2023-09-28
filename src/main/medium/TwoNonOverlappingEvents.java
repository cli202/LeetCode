package main.medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class TwoNonOverlappingEvents {
    public int maxTwoEvents(int[][] events) {
        int result = 0;
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < events.length; i++) {
            int sum = events[i][2];
            int firstEnd = events[i][1];
            for (int j = i + 1; j < events.length; j++) {
                if (events[j][0] > firstEnd && sum + events[j][2] > result) {
                    result = sum + events[j][2];
                }
            }
            result = Math.max(sum, result);
        }
        return result;
    }
}
