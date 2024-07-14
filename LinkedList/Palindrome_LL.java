// Input: head = [1,2,2,1]
// Output: true
    
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
			 return true;
		}
			    
		ListNode slow = head;
		ListNode fast = head;
			 
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
        ListNode newHead = reverseLL(slow.next);
        ListNode first = head;
        ListNode second = newHead;
        
        while(second != null){
            if(first.val != second.val){
                reverseLL(newHead); 
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLL(newHead); 
        return true;
}
    
    public ListNode reverseLL(ListNode node) {
						
		if(node == null || node.next == null) {
			return node;
		}
		  ListNode prev = null;
		  ListNode curr = node;
          while(curr != null){
              ListNode forw = curr.next;
              curr.next = prev;
              prev = curr;
              curr = forw;
          }
		return prev;			
	}
}