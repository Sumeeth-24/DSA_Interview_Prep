// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) { return null; }
        
      
        ListNode slow = head;
        ListNode fast = head;
        
       for(int i=0; i < n; i++){
           fast = fast.next;
       }
        
        if(fast == null) return head.next;
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}