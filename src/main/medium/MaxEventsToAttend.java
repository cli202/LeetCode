package main.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class MaxEventsToAttend {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0;
        int result = 0;
        for (int day = 0; day <= 100000; day++) {
            // remove all closed events (events where end time is less than day)
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            // adds all events starting dayth day to priority queue
            while (index < events.length && events[index][0] == day) {
                pq.add(events[index][1]);
                index++;
            }

            // if pq is not empty, remove one open even that's attended dayth day
            if (!pq.isEmpty()) {
                pq.poll();
                result++;
            }
        }
        return result;
    }
}
