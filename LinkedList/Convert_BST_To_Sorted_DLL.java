class Solution
{
    public Node getrightmostnode(Node node, Node curr){
        while(node.right != null && node.right != curr){
        node = node.right;
        }
        return node;
    }
    
    Node bToDLL(Node root)
    {
	   Node dummy = new Node(-1);
	   Node prev = dummy, curr = root;
	   
	   while(curr != null){
	       Node left = curr.left;
	       if(left == null){
	           
	           // created links
	           prev.right = curr;
	           curr.left = prev;
	           prev = curr;
	           
	           //move
	           curr = curr.right;
	       } else {
	           Node rightMostNode = getrightmostnode(left, curr);
	           
	           if(rightMostNode.right == null){
	               rightMostNode.right = curr;  // thread creation
	               curr = curr.left;
	           } else {
	               rightMostNode.right = null;
	               
	               //created links
	               prev.right = curr;
	               curr.left = prev;
	               prev = curr;
	               
	               //move
	               curr = curr.right;
	           }
	       }
	   }
	   
	   Node head = dummy.right;
	   
	   dummy.right = head.left = null;
	   
	   //prev.right = head;
	   //head.left = prev;
	   
	   return head;
	   
    }
}