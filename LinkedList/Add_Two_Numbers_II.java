// 7 -> 2 -> 4 -> 3        3 -> 4 -> 2 -> 7
//      5 -> 6 -> 4    ==> 4 -> 6 -> 5    
// 7 -> 8 -> 0 -> 7        7 -> 0 -> 8 -> 7     ==> ANS = reverse(7087) => 7807

class Solution {
    
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        
        ListNode prev = null, curr = head;
        while(curr != null){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) return l1 != null ? l1 : l2;
        
        ListNode c1 = reverse(l1);
        ListNode c2 = reverse(l2);
        
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while (c1 != null || c2 != null || carry != 0) {
            int sum = 0;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            sum += carry;
            ListNode node = new ListNode(sum%10);
            carry = sum/10;
            temp.next = node;

            temp = temp.next;
        }
        return reverse(dummy.next);
    }
}