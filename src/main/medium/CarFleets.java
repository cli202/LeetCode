package main.medium;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class CarFleets {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] sorted = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            sorted[i][0] = position[i];
            sorted[i][1] = speed[i];
        }

        Arrays.sort(sorted, (a, b) -> Integer.compare(b[0], a[0]));
        double[] times = new double[position.length];
        for (int i = 0; i < sorted.length; i++) {
            times[i] = (double) (target - sorted[i][0]) / sorted[i][1];
        }

        int result = 0;
        double prev = 0;
        for (int i = 0; i < times.length; i++) {
            if (prev < times[i]) {
                result++;
                prev = times[i];
            }
        }
        return result;
    }
}
