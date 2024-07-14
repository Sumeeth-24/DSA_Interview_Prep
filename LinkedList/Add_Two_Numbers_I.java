// The digits are stored in reverse order

// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.
    
    // TC -> O(Max(N1, N2)) where N1 and N2 are length of respective List.
    // SC -> O(Max(N1, N2)) where N1 and N2 are length of respective List.
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode dummy = new ListNode();
    ListNode temp = dummy;
   
    while (l1 != null || l2 != null || carry != 0) {
        int sum = 0;
        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }
        sum += carry;
        ListNode node = new ListNode(sum%10);
        carry = sum/10;
        temp.next = node;
        
        temp = temp.next;
    }
    return dummy.next;
    }
}