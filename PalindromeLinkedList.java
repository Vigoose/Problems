/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode middle = findMiddle(head);
        middle.next = reverse(middle.next);
        ListNode p = head;
        ListNode q = middle.next;
        while (p != null && q != null){
            if (p.val != q.val) return false;
            p = p.next;
            q = q.next;
        }
        return true;
    }
    
    /*    prev
    prev <-1->2->3
           temp
    
    */
    private ListNode reverse(ListNode node){
        ListNode prev = null;
        while (node != null){
            ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        return prev;
    }
    
    private ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
