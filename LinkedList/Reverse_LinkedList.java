
// ANS = reverse(7087) => 7807

// RECURSIVE SOLUTION 
// TC - O(N)
// SC - O(N) - recursive Stack space
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        return head;
    
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}

// ITERATIVE SOLUTION 
// TC - O(N)
// SC - O(1)
class Solution {
    
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        
        ListNode prev = null, curr = head;
        while(curr != null){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
}