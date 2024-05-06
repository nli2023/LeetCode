// LeetCode 24
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
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode cur = pre;

        ListNode tmp;
        ListNode firstNode;
        ListNode secondNode;

        while (cur.next != null && cur.next.next != null) {
            tmp = cur.next.next.next;
            firstNode = cur.next;
            secondNode = cur.next.next;

            cur.next = secondNode;
            secondNode.next = firstNode;
            firstNode.next = tmp;
            cur = firstNode;
        }
        return pre.next;

    }
}
