// If there are two middle nodes, return the second middle node.
    
// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.
    
// Input: head = [1,2,3,4,5,6]
// Output: [4,5,6]
// Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
    
// TC -> O(N/2)  where N is length of List
// SC -> O(1) 
    
class Solution {
    // even n/2 + 1 => 5/2 + 1 = 3,  6/2 + 1 = 4 bruteforce
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}