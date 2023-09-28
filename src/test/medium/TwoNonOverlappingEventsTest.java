package test.medium;

import org.junit.Test;
import main.medium.TwoNonOverlappingEvents;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class TwoNonOverlappingEventsTest {
    @Test
    public void test1() {
        TwoNonOverlappingEvents twoNonOverlappingEvents = new TwoNonOverlappingEvents();
        int[][] events = new int[][] {{1,3,2},{4,5,2},{1,5,5}};
        System.out.println(twoNonOverlappingEvents.maxTwoEvents(events));
    }

    @Test
    public void test2() {
        TwoNonOverlappingEvents twoNonOverlappingEvents = new TwoNonOverlappingEvents();
        int[][] events = new int[][] {{10,83,53},{63,87,45},{97,100,32},{51,61,16}};
        System.out.println(twoNonOverlappingEvents.maxTwoEvents(events));
    }

    @Test
    public void test3() {
        TwoNonOverlappingEvents twoNonOverlappingEvents = new TwoNonOverlappingEvents();
        int[][] events = new int[][] {{35,90,47},{72,80,70}};
        System.out.println(twoNonOverlappingEvents.maxTwoEvents(events));
    }

}