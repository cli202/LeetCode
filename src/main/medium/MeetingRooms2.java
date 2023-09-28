package main.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Problem: 253. Meeting Rooms II
 * Date: 8/22/2023
 * Difficulty: Medium
 * Understanding: Half
 * Topics: Array, Two Pointer, Greedy, Sorting, Heap
 * Companies: Google, TikTok, Amazon
 */
public class MeetingRooms2 {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int result = 0;
        for (int[] interval: intervals) {
            int start = interval[0];
            int end = interval[1];
            if (heap.isEmpty()) {
                heap.add(end);
            } else {
                if (heap.peek() > start) {
                    result++;
                } else {
                    heap.remove();
                }
                heap.add(end);
            }
        }
        return result + 1;
    }
}
