    //   5 -> 7 -> 9 -> null
   //    3->4 -> 8 -> 10 -> null
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
		
        ListNode dummynode = new ListNode(0);
        ListNode prev = dummynode;
        ListNode c1 = l1, c2 = l2;
        
        while(c1 != null && c2 != null){
            if(c1.val < c2.val){
                prev.next = c1;
                c1 = c1.next;
            } else {
                prev.next = c2;
                c2 = c2.next;
            }
            prev = prev.next;
        }
        prev.next = c1 != null ? c1 : c2;
        return dummynode.next;
}
}




 