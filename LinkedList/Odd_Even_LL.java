// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
    
// Input: head = [2,1,3,5,6,4,7]
// Output: [2,3,6,7,1,5,4]

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}