// If the loop is present then return the count of nodes in a loop or else return 0.

class Solution
{
    static int findLength(Node slow, Node fast){
        int count = 1;
        fast = fast.next;
        
        while(slow != fast){
            count++;
            fast = fast.next;
        }
        
        return count;
    }
    static int countNodesinLoop(Node head)
    {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return findLength(slow, fast);
            }
        }
        return 0;
    }
}