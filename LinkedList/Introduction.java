INTRODUCTION :-

Like arrays, a Linked List is a linear data structure. Unlike arrays, linked list elements are not stored at a contiguous location; the elements are linked using pointers. They include a series of connected nodes. Here, each node stores the data and the address of the next node.

Advantages of Linked Lists over arrays:
  1. Dynamic Array.
  2. Ease of Insertion/Deletion.
  3. Insertion at the beginning is a constant time operation and takes O(1) time, as compared to arrays where inserting an element at   the       beginning takes O(n) time,where n is the number of elements in the array.

Drawbacks of Linked Lists: 
  1. Random access is not allowed. We have to access elements sequentially starting from the first node(head node). So we cannot do a  binary    search with linked lists efficiently with its default implementation. 
  2. Extra memory space for a pointer is required with each element of the list. 
  3. Not cache-friendly. Since array elements are contiguous locations, there is the locality of reference which is not there in the case of   linked lists.
  4. It takes a lot of time in traversing and changing the pointers.
  5. Reverse traversing is not possible in singly linked lists.
  6. It will be confusing when we work with pointers.
  7. Direct access to an element is not possible in a linked list as in an array by index.
  8. Searching for an element is costly and requires O(n) time complexity.
  9. Sorting of linked lists is very complex and costly.
  10. Appending an element to a linked list is a costly operation, and takes O(n) time, where n is the number of elements in the linked list,  as compared to arrays that take O(1) time.

Time Complexity 	Worst Case	Average Case
Search	               O(n)	       O(n)
Insertion	           O(1)	       O(1)
Deletion	           O(1)	       O(1)