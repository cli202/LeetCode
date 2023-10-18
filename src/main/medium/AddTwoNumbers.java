package main.medium;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        // ListNode head = l1;

        while (l1 != null) {
            sb1.insert(0, l1.val);
            l1 = l1.next;
        }


        while (l2 != null) {
            sb2.insert(0, l2.val);
            l2 = l2.next;
        }

        int num = Integer.valueOf(sb1.toString()) + Integer.valueOf(sb2.toString());
        ListNode head = new ListNode();
        ListNode result = head;
        while (num != 0) {
            head.val = num % 10;
            num /= 10;
            head = head.next;
        }

        return result;

//        String number = Integer.toString(num);
//        ListNode head = new ListNode();
//
//        for (int i = 0; i < number.length(); i++) {
//            head.val = number.charAt(i)
//        }
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
