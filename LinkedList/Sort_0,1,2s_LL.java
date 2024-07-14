// Input:
// N = 8
// value[] = {1,2,2,1,2,0,2,2}
// Output: 0 1 1 2 2 2 2 2

class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
       if(head == null || head.next == null){
           return head;
       }
       
       Node temp = head;
       Node zero = new Node(-1);
       Node zeroHead = zero;
       Node one = new Node(-1);
       Node oneHead = one;
       Node two = new Node(-1);
       Node twoHead = two;
       
       while(temp != null){
           if(temp.data == 0){
             zero.next = temp;
             zero = temp;
           } 
           else if(temp.data == 1){
               one.next = temp;
               one = temp;
           }
           else{
               two.next = temp;
               two = temp;
           }
           temp = temp.next;
       }
       
       zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
       one.next = twoHead.next;
       two.next = null;
       
       Node newHead = zeroHead.next;
       
       return newHead;
    }
}
