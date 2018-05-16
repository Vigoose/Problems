/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    private Random rmd;
    private ListNode head;
    public Solution(ListNode head) {
        this.head = head;
        rmd = new Random();
    } 
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode temp = head;
        int res = temp.val;
        int i = 1;
        while (temp.next != null){
            temp = temp.next;
            if (rmd.nextInt(++i) == 0){
                res = temp.val;
            }
                
        }
        
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
