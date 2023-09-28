package test.hard;

import org.junit.Test;
import main.hard.MeetingRooms3;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class MeetingRooms3Test {
    @Test
    public void test1() {
        int[][] meetings = new int[][] {{0,10}, {1,5}, {2,7}, {3,4}};
        MeetingRooms3 meetingRooms3 = new MeetingRooms3();
        System.out.println(meetingRooms3.mostBooked(2, meetings));
    }

    @Test
    public void test2() {
        int[][] meetings = new int[][]{{0, 10}, {1, 2}, {12, 14}, {13, 15}};
        MeetingRooms3 meetingRooms3 = new MeetingRooms3();
        System.out.println(meetingRooms3.mostBooked(2, meetings));
    }
}