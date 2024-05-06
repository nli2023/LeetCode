// LeetCode 19
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode tmp = new ListNode(0);
        tmp.next = head;
        ListNode fastPointer = tmp;
        ListNode slowPointer = tmp;

        for (int i = 0; i <= n; i++) {
            fastPointer = fastPointer.next;
        }

        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        if (slowPointer.next != null) {
            slowPointer.next = slowPointer.next.next;
        }

        return tmp.next;
    }
}