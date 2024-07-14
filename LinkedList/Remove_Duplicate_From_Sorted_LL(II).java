//Input: head = [1,2,3,3,4,4,5]
//Output: [1,2,5]

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        while(head != null){
            if(head.next != null && head.val == head.next.val){
                //skip nodes equal to head val
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
                
            }
            else{
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
