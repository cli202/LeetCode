package test.easy;

import org.junit.Test;
import main.easy.MergeSortedLists;
import main.easy.MergeSortedLists.ListNode;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class MergeSortedListsTest {
    @Test
    public void test1() {
        MergeSortedLists mergeSortedLists = new MergeSortedLists();
        ListNode list1 = new ListNode(new int[] {1, 2, 4});
        ListNode list2 = new ListNode(new int[] {1, 3, 4});

        System.out.println(mergeSortedLists.mergeTwoLists(list1, list2));
    }
}