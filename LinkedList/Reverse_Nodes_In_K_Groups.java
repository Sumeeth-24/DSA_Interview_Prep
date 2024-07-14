class Solution {
     static ListNode tt = null;
    static ListNode th = null;

    public static void addFirst(ListNode node) {
        if (th == null) {
            th = node;
            tt = node;
        } else {
            node.next = th;
            th = node;
        }
    }

    public static int length(ListNode node) {
        int len = 0;
        while (node != null) {
            node = node.next;
            len++;
        }
        return len;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
         if (head == null || head.next == null || k <= 1)
            return head;

        int len = length(head);

        ListNode oh = null;
        ListNode ot = null;
        ListNode curr = head;

        while (curr != null && len >= k) {
            int tempK = k;
            while (tempK-- > 0) {
                ListNode forw = curr.next;

                curr.next = null;
                addFirst(curr);

                curr = forw;
            }

            len -= k;
            if (oh == null) {
                oh = th;
                ot = tt;
            } else {
                ot.next = th;
                ot = tt;
            }

            th = null;
            tt = null;
        }

        ot.next = curr;
        return oh;
    }
}
