package main.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Problem: 252. Meeting Rooms
 * Date: 8/19/2023
 * Difficulty: Easy
 * Understanding: Almost
 * Topics: String
 * Companies: Ebay, Google, Amazon
 */
public class MeetingRoom {
    public boolean canAttendMeetings(int[][] intervals) {
//        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o2[0] - o1[0];
                } else {
                    // descending
//                    return o2[1] - o1[1];
                    // ascending
                      return o1[1] - o2[1];

                }
            }
        });
//        for (int[] interval: intervals) {
//            System.out.println(interval[0] + " " + interval[1]);
//        }
        Arrays.stream(intervals).forEach(x -> Arrays.stream(x).forEach(y -> System.out.print(y + " ")));
        return false;
//        int min = 0;
//        int max = 0;
//        for (int[] interval: intervals) {
//            int start = interval[0];
//            int end = interval[1];
//
//            if (inRange(min, max, start) || inRange(min, max, end)) {
//                return false;
//            } else if (start < max && end > min) {
//                return false;
//            } else {
//                min = start;
//                max = end;
//            }
//        }
//        return true;
    }

    public boolean inRange(int min, int max, int num) {
        return num > min && num < max;
    }
}
