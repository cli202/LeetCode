package main.medium;

/**
 * Problem: 2028. Find Missing Observations
 * Date: 8/27/2023
 * Difficulty: Medium
 * Understanding: Complete
 * Topics: Array, Math, Simulation
 * Companies: Microsoft, Amazon
 */
public class FindMissingObservations {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] result = new int[n];
        int total = mean * (n + rolls.length);
        for (int i = 0; i < rolls.length; i++) {
            total -= rolls[i];
        }
        if (total > n * 6 || total <= 0) {
            return new int[0];
        }
        int avg = total / n;
        int extra = total % n;
        if (extra == 0) {
            for (int i = 0; i < n; i++) {
                result[i] = avg;
            }
        } else if (extra <= 6 - avg){
            for (int i = 0; i < n - 1; i++) {
                result[i] = avg;
            }
            result[n] = avg + extra;
        } else {
            int stop = extra > 6 - avg ? n - extra : n;
            for (int i = 0; i < stop; i++) {
                result[i] = avg;
            }
            for (int i = stop; i < n; i++) {
                result[i] = avg+1;
            }
        }
        return result;
    }
}
