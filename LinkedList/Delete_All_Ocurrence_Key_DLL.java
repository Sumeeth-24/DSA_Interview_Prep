// Input: 
// 2<->2<->10<->8<->4<->2<->5<->2
// 2
// Output: 
// 10<->8<->4<->5
// Explanation: 
// All Occurences of 2 have been deleted.

class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
       Node temp = head;
       while(temp != null){
           if(temp.data == x){
               // if temp is the head of the LL
               // then post deletion the head will be updated
               if(temp == head){
                   head = head.next;
               }
               
               Node nextNode = temp.next;
               Node prevNode = temp.prev;
               
               if(nextNode != null) nextNode.prev = prevNode;
               if(prevNode != null) prevNode.next = nextNode;
               
               temp = nextNode;
           }
           else{
               temp = temp.next;
           }
       }
       return head;
    }
}