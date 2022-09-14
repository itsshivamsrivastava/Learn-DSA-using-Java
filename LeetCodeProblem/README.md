Linked List: 
- A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
- The elements in a linked list are linked using pointers.

Types of Linked List:
  1. Singly Linked List
  2. Doubly Linked List
  3. Circular Linked List

Advantages of Linked List:
  1. Dynamic Size (No need to specify the size of the list)
  2. Ease of insertion/deletion.
  3. No need to specify size.
  4. No need to shift elements.
  5. No need to allocate memory and deallocate memory.
  6. No need to worry about memory overflow, memory fragmentation, and memory access time.
  7. No need to worry about cache misses.

Disadvantages of Linked List:
  1. Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do binary search with linked lists efficiently with its default implementation.
  2. Extra memory space for a pointer is required with each element of the list.
  3. Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists.

            Applications of Linked List:
            1. Implementation of stacks and queues.
            2. Implementation of graphs.
            3. Implementation of hash tables.
            4. Implementation of adjacency lists.
            5. Implementation of dynamic memory allocation.
            6. Implementation of undo functionality in text editors.

            Implementation of Linked List:
            1. Using Arrays
            2. Using Pointers
            3. Using Classes

            1. Using Arrays:
            We can implement a linked list using arrays. In this method, we store the address of the next element in the current element. For example, if the current element is stored at arr[i], then the next element will be stored at arr[arr[i]].

            2. Using Pointers:
            We can implement a linked list using pointers. In this method, we store the address of the next element in the current element. For example, if the current element is stored at ptr, then the next element will be stored at ptr->next.

            3. Using Classes:
            We can implement a linked list using classes. In this method, we create a class Node which contains two parts:
                a. Data
                b. Address of the next node

            Note: The last node will contain address as NULL to mark the end of the list.

            Operations on Linked List:
            1. Insertion
            2. Deletion
            3. Traversal
            4. Searching
            5. Sorting
            6. Reversing
            7. Merging
            8. Splitting
            9. Detecting Loop
            10. Removing Loop
            11. Finding Middle Element.
            12. Finding Nth Node from the end.
            13. Finding Nth Node from the beginning.
            14. Finding Length of the Linked List.
            15. Finding the sum of all elements in the Linked List.
            16. Finding the maximum element in the Linked List.

            1. Insertion:
            There are three types of insertion:
                a. Insertion at the beginning
                b. Insertion at the end
                c. Insertion at a given position

                a. Insertion at the beginning:
                We create a new node and make the next of the new node point to the head of the linked list. Then we make the new node as the head of the linked list.

                b. Insertion at the end:
                We create a new node and make the next of the new node point to NULL. Then we traverse the linked list and make the next of the last node point to the new node.

                c. Insertion at a given position:
                We create a new node and make the next of the new node point to the next of the node at the given position. Then we make the next of the node at the given position point to the new node.

            2. Deletion:
            There are three types of deletion:
                a. Deletion at the beginning
                b. Deletion at the end
                c. Deletion at a given position

                a. Deletion at the beginning:
                We make the head of the linked list point to the next of the head of the linked list.

                b. Deletion at the end:
                We traverse the linked list and make the next of the second last node point to NULL.

                c. Deletion at a given position:
                We make the next of the node at the given position point to the next of the next of the node at the given position.

            Linked list in Java:
                - We can implement a linked list in Java using the LinkedList class.
                - The LinkedList class implements the List interface and extends the AbstractSequentialList class.
                - The LinkedList class is a doubly linked list implementation of the List and Deque interfaces.
                - The LinkedList class can also be used as a list, stack or queue.
                - The LinkedList class is a member of the java.util package.

            Syntax of the LinkedList in Java:
                LinkedList<DataType> listName = new LinkedList<DataType>();

            Constructors of LinkedList class:
                1. LinkedList()
                2. LinkedList(Collection c)
                3. LinkedList(Deque d)
                4. LinkedList(List l)
                5. LinkedList(Queue q)
                6. LinkedList(String s)
                7. LinkedList(String s, Locale l)
                8. LinkedList(String s, Charset c)
                9. LinkedList(String s, CharsetDecoder d) and so on.

            Methods of LinkedList class:
                1. add()
                2. addAll()
                3. add(int index, Object element)
                4. clear()
                5. clone()
                6. get()
                7. getFirst()
                8. getLast()
                9. indexOf()
                10. lastIndexOf() and so on.
