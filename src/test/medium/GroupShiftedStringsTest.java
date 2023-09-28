package test.medium;

import org.junit.Test;
import main.medium.GroupShiftedStrings;

import java.util.*;

public class GroupShiftedStringsTest {
    @Test
    public void test1() {
        String[] list = new String[] {"abc","bcd","acef","xyz","az","ba","a","z"};
        GroupShiftedStrings groupShiftedStrings = new GroupShiftedStrings();
        System.out.println(groupShiftedStrings.groupStrings(list));
    }

    @Test
    public void testEdge() {
        String[] list = new String[] {"az","ba","a","z"};
        GroupShiftedStrings groupShiftedStrings = new GroupShiftedStrings();
        System.out.println(groupShiftedStrings.groupStrings(list));
    }

    @Test
    public void testEdge2() {
        String[] list = new String[] {"al", "abc","bcd","acef","xyz","az","ba","a","z"};
        GroupShiftedStrings groupShiftedStrings = new GroupShiftedStrings();
        System.out.println(groupShiftedStrings.groupStrings(list));
    }



}