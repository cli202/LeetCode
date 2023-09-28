package test.medium;

import org.junit.Test;
import main.medium.MaxEventsToAttend;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class MaxEventsToAttendTest {
    @Test
    public void test1(){
        MaxEventsToAttend maxEventsToAttend = new MaxEventsToAttend();
        int[][] events = new int[][] {{1,4},{4,4},{2,2},{3,4},{1,1}};
        System.out.println(maxEventsToAttend.maxEvents(events));
    }

    @Test
    public void test2(){
        MaxEventsToAttend maxEventsToAttend = new MaxEventsToAttend();
        int[][] events = new int[][] {{1,2},{1,2},{3,3},{1,5},{1,5}};
        System.out.println(maxEventsToAttend.maxEvents(events));
    }

    @Test
    public void test3(){
        MaxEventsToAttend maxEventsToAttend = new MaxEventsToAttend();
        int[][] events = new int[][] {{1,5},{1,5},{1,5},{2,3},{2,3}};
        System.out.println(maxEventsToAttend.maxEvents(events));
    }
}