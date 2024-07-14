// Input: 17->15->8->12->10->5->4->1->7->6->NULL
// Output: 8->12->10->4->6->17->15->5->1->7->NULL

class Solution{
    Node divide(int N, Node head){
        if(head == null || head.next == null) return head;
        
        Node dummyEven = new Node(-1);
        Node dummyOdd = new Node(-1);
        Node evenTail = dummyEven, oddTail = dummyOdd, curr = head;
        
        while(curr != null){
            if(curr.data % 2 != 0){
                oddTail.next = curr;
                oddTail = oddTail.next;
            }
            else{
               evenTail.next = curr;
               evenTail = evenTail.next; 
            }
            curr = curr.next;
        }
        evenTail.next = dummyOdd.next;
        oddTail.next = null; // important test case
        return dummyEven.next;
    }
}