class GfG
{
     Node mergeSortTwoLists(Node a, Node b){
	      Node temp = new Node(0);
	      Node res = temp;
	      
	      while(a != null && b != null){
	          if(a.data < b.data){
	              temp.bottom = a;
	              a = a.bottom;
	          }
	          else {
	              temp.bottom = b;
	              b = b.bottom;
	          }
	          temp = temp.bottom;
	      }
	      
	      if(a!= null) temp.bottom = a;
	  else temp.bottom = b;
	  return res.bottom;
 }
	  
	  
    Node flatten(Node head)
    {
	   if(head == null || head.next == null) return head;
	   
	   Node mergedHead = flatten(head.next);
	   
	   return mergeSortTwoLists(head, mergedHead);   
    }
}