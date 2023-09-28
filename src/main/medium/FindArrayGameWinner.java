package main.medium;

/*
1535. Find the Winner of an Array Game
8/14/2023
Difficulty: Medium
Topics: Array, Simulation
Understanding: Almost fully
Companies: Directi
 */

public class FindArrayGameWinner {
    public int getWinner(int[] arr, int k) {
        int max = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            } else {
                count++;
            }
            if (count == k) {
                return max;
            }
        }
        return max;
    }
}
