
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
 ListNode[] ans = new ListNode[k];
        
        int totalLen = 0;
        ListNode curr = head;
        
        while(curr != null){
            totalLen++;
            curr = curr.next;
        }
        
        int eachBucketNodes = totalLen/k;
        int distribute = totalLen%k;
        
         curr = head;
        ListNode prev = null;
        
       
        
        for(int i = 0; curr != null && i < k; i++) {
            ans[i] = curr;
            
            for(int count = 1; count <= eachBucketNodes + (distribute > 0 ? 1 : 0); count++){   // O(K + L)
                
                prev = curr;
                curr = curr.next;
            }
            
            prev.next = null;
            distribute--;
        }
        
        return ans;
    }
}