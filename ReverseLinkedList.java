/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = cur.next;
        
        while (cur != null){
            cur.next = prev;
            prev = cur;
            cur = next;
            if (cur != null) next = cur.next;
        }
        return prev;
    }
}
