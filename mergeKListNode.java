class Solution {
    public ListNode mergeKLists(ListNode[] lists) {        
        if (lists==null||lists.length==0) return null;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;      
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.length, (a, b) -> a.val- b.val);
        for (int i = 0; i < lists.length; i++){
            if (lists[i] != null){
                queue.add(lists[i]);
            } 
        }
            while (!queue.isEmpty()){
                cur.next= queue.poll();
                cur = cur.next;
                if(cur.next !=null){
                    queue.add(cur.next);
                }
            }

        return dummy.next;
    }
}
