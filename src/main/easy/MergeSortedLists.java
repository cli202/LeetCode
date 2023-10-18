package main.easy;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = list1;
        ListNode next = null;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1 = list1.next;
            } else {
                next = list1.next;
                list1.next = list2;
                list2 = list2.next;
                list1.next.next = next;
            }
        }

        return head;
    }


    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }

        public ListNode(int[] arr) {
            ListNode head = new ListNode(arr[0]);
            ListNode curr = head;
            for (int num: arr) {
                curr = new ListNode(num);
                curr = curr.next;
            }
        }
    }
}
