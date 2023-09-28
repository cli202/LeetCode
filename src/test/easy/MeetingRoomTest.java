package test.easy;

import org.junit.Test;
import main.easy.MeetingRoom;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class MeetingRoomTest {
    @Test
    public void test1() {
        int[][] intervals = new int[][] {{0,30},{5,10},{15,20}};
        MeetingRoom meetingRoom = new MeetingRoom();
        System.out.println(meetingRoom.canAttendMeetings(intervals));
    }

    @Test
    public void test2() {
        int[][] intervals = new int[][] {{7, 10}, {2, 4}};
        MeetingRoom meetingRoom = new MeetingRoom();
        System.out.println(meetingRoom.canAttendMeetings(intervals));
    }

    @Test
    public void test3() {
        int[][] intervals = new int[][] {{9, 14}, {12, 19}};
        MeetingRoom meetingRoom = new MeetingRoom();
        System.out.println(meetingRoom.canAttendMeetings(intervals));
    }

    @Test
    public void test4() {
        int[][] intervals = new int[][] {{134, 497}, {199, 282}};
        MeetingRoom meetingRoom = new MeetingRoom();
        System.out.println(meetingRoom.canAttendMeetings(intervals));
    }

    @Test
    public void test5() {
        int[][] intervals = new int[][] {{0,3}, {0,1}, {0,2}};
        MeetingRoom meetingRoom = new MeetingRoom();
        System.out.println(meetingRoom.canAttendMeetings(intervals));
    }
}