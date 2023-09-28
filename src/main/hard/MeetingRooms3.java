package main.hard;

import main.easy.MeetingRoom;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Problem: 2402. Meeting Rooms III
 * Date: 8/24/2023
 * Difficulty: Hard
 * Understanding: Half
 * Topics: Array, Sorting, Heap (Priority Queue)
 * Companies: Google, Uber
 */
public class MeetingRooms3 {
    public int mostBooked(int n, int[][] meetings) {
        int[] count = new int[n];
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            rooms.add(i);
        }
        PriorityQueue<MeetingRoom> endTimes = new PriorityQueue<>();
        for (int i = 0; i < meetings.length; i++) {
            int start = meetings[i][0];
            int end = meetings[i][1];
            while (!endTimes.isEmpty() && start >= endTimes.peek().end) {
                rooms.add(endTimes.remove().room);
            }
            if (!rooms.isEmpty()) {
                int roomNum = rooms.remove();
                endTimes.add(new MeetingRoom(roomNum, end));
                count[roomNum]++;
            } else {
                int roomNum = endTimes.peek().room;
                int originEnd = endTimes.remove().end;
                count[roomNum]++;
                endTimes.add(new MeetingRoom(roomNum, originEnd + (end - start)));
            }
        }
        int max = 0;
        int room = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > max) {
                max = count[i];
                room = i;
            }
        }
        for(int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
        return room;
    }

    public class MeetingRoom implements Comparable{
        public int room;
        public int end;

        public MeetingRoom(int room, int end) {
            this.room = room;
            this.end = end;
        }

        @Override
        public int compareTo(Object o) {
            MeetingRoom other = (MeetingRoom) o;
            return this.end == other.end ? this.room - other.room : (int) (this.end - other.end);
        }
    }
}
