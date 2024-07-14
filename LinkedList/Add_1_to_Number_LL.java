// Input:
// LinkedList: 4->5->6
// Output: 457
// Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457.

// Input:
// LinkedList: 9->9->9
// Output: 1000
// Explanation: 9-9->9 represents 999 and when 1 is added it becomes 1000. // brute force is reversing the LL

class Solution
{
    public static int addHelper(Node temp){
        if(temp == null){
            return 1;
        }
        
        int carry = addHelper(temp.next);
        temp.data += carry;
        if(temp.data < 10){
            return 0;
        }
        temp.data = 0;
        return 1;
    }
    
    
    public static Node addOne(Node head) 
    { 
       int carry = addHelper(head);
       
       if(carry == 1){
           Node newNode = new Node(1);
           newNode.next = head;
           return newNode;
       }
       return head;
    }
}