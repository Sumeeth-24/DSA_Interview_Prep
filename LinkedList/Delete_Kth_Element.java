Input: head = [1,2,3,4,5], k = 3
Output: [1,2,4,5]

class Node deleteK(Node head, int k) {
        // Check if the list is empty
        if (head == null)
            return head;

        // If k is 1, delete the first node
        if (k == 1) {
            Node temp = head;
            head = head.next;
            temp = null;
            return head;
        }

        // Traverse the list to find the k-th node
        Node temp = head;
        Node prev = null;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            // If the k-th node is found
            if (cnt == k) {
                // Adjust the pointers to skip the k-th node
                prev.next = prev.next.next;
                // Delete the k-th node
                temp = null;
                break;
            }
            // Move to the next node
            prev = temp;
            temp = temp.next;
        }

        return head;
    }