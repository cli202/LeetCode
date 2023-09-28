package test.medium;

import org.junit.Test;
import main.medium.MeetingRooms2;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class MeetingRooms2Test {
    @Test
    public void test1() {
        MeetingRooms2 meetingRooms2 = new MeetingRooms2();
        int[][] intervals = new int[][] {{0,30},{5,10},{15,20}};
        System.out.println(meetingRooms2.minMeetingRooms(intervals));
    }

    @Test
    public void test2() {
        MeetingRooms2 meetingRooms2 = new MeetingRooms2();
        int[][] intervals = new int[][] {{7, 10}, {2, 4}};
        System.out.println(meetingRooms2.minMeetingRooms(intervals));
    }

    @Test
    public void test3() {
        MeetingRooms2 meetingRooms2 = new MeetingRooms2();
        int[][] intervals = new int[][] {{6,15},{13,20},{6,17}};
        System.out.println(meetingRooms2.minMeetingRooms(intervals));
    }

    @Test
    public void test5() {
        MeetingRooms2 meetingRooms2 = new MeetingRooms2();
        int[][] intervals = new int[][] {{1,5},{8,9},{8,9}};
        System.out.println(meetingRooms2.minMeetingRooms(intervals));
    }
}