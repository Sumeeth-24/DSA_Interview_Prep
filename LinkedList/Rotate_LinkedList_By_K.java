// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]

// TC - O(N)
// TC - O(1)
class Solution {
    public int getSizeOfList(ListNode node) {
		 if(node == null){
            return 0;
        }
        
        int count = 0;
        
        while(node != null){
            node = node.next;
            count++;
        }
        
        return count;
	}
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k < 0) {
			return head;
		}
		
	  int sizeoflinkedlist = getSizeOfList(head);
	  k = k % sizeoflinkedlist;
	  if(k == 0) {
		  return head;
	  }
	  
	  ListNode tmp = head;
	  int i = 1;
	  
      // this is for clockwise direction
	  while(i < sizeoflinkedlist - k) {        
		  tmp = tmp.next;
		  i++;
	  }

       // this is for anticlockwise direction
    //  while(i < k) {       
	// 	  tmp = tmp.next;
	// 	  i++;
	//   }
	  
	  ListNode temp = tmp.next;
	  ListNode root = temp;
	  tmp.next = null;
	  
	  while(temp.next != null) {
		  temp = temp.next;
	  }
	  
	  temp.next = head;
	  return root;
    }
}