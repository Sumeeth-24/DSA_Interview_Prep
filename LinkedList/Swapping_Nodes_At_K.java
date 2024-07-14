Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode nodeK = new ListNode(0);
        
        for (int i = 1; i < k; i++) first = first.next; // 2
        nodeK = first;  // 2 to store the data for swapping in future.
        
        first = first.next;  // 3
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        int temp = nodeK.val;
        nodeK.val = second.val;
        second.val = temp;
        return head;
    }
}