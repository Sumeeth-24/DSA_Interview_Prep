// Input:  
// 1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
// target = 7
// Output: (1, 6), (2,5)
// Explanation: We can see that there are two pairs 
// (1, 6) and (2,5) with sum 7.

class Solution {
    public static Node findTail(Node head){
        Node tail = head;
        while(tail.next != null) tail = tail.next;
        return tail;
    }
    
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(head == null) return result;
        Node left = head;
        Node right = findTail(head);
        
        while(left.data < right.data){
            if(left.data + right.data == target){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(left.data);
                temp.add(right.data);
                result.add(temp);
                left = left.next;
                right = right.prev;
            }
            else if(left.data + right.data < target){
                left = left.next;
            }
            else{
                right = right.prev;
            }
        }
        return result;
    }
}
        