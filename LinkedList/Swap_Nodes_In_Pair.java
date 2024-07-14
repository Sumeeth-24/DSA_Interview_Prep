Input: head = [1,2,3,4]
Output: [2,1,4,3]

class Solution {

public ListNode swapPairs(ListNode head) {
        if(!head || !head.next)
            return head;
        
        ListNode nextNode = head.next;
        head.next = swapPairs(head.next.next);
        nextNode.next = head;
        return nextNode;
    }
};