Time Complexity: O(N * K * log K)
Auxiliary Space: O(K)

class GFG {
    // Function to merge k sorted linked lists
    static Node mergeKList(Node[] arr, int K)
    {
        // Priority_queue 'queue' implemented
        // as min heap with the help of
        // 'compare' function
        PriorityQueue<Node> queue
            = new PriorityQueue<>(new NodeComparator());
        Node at[] = new Node[K];
        Node head = new Node(0);
        Node last = head;
        // Push the head nodes of all
        // the k lists in 'queue'
        for (int i = 0; i < K; i++) {
            if (arr[i] != null) {
                queue.add(arr[i]);
            }
        }
        // Handles the case when k = 0
        // or lists have no elements in them
        if (queue.isEmpty())
            return null;
        // Loop till 'queue' is not empty
        while (!queue.isEmpty()) {
            // Get the top element of 'queue'
            Node curr = queue.poll();
 
            // Add the top element of 'queue'
            // to the resultant merged list
            last.next = curr;
            last = last.next;
            // Check if there is a node
            // next to the 'top' node
            // in the list of which 'top'
            // node is a member
            if (curr.next != null) {
                // Push the next node of top node
                // in 'queue'
                queue.add(curr.next);
            }
        }
        // Address of head node of the required
        // merged list
        return head.next;
    }