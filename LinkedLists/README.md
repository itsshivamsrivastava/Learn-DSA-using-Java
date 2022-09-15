<details>
<summary>

# Introduction to Linked List
</summary>

- A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
- The elements in a linked list are linked using pointers.
- A linked list is a dynamic data structure.
- Each element in a list is called a node.
- The first node is called the head.
- The last node points to null.
- Each node contains two parts: data and a reference to the next node.
- The last node has a reference to null.
- The entry point into a linked list is called the head of the list.
- The head is a reference to the first node in a linked list.
- The head is null if the list is empty.
- The head is the only reference that you need to keep track of to access the entire list.

<img src="https://user-images.githubusercontent.com/73056786/190239678-18b42b01-59f7-46aa-8990-e066e0095ac1.png" alt="Linked-list"/>

## Linked List Example
    import java.util.LinkedList;

    public class LL {
        public static void main(String[] args) {

            // Create a linked list.
            LinkedList<Integer> list = new LinkedList<Integer>();

            // Print the linked list before adding elements.
            System.out.println("Initial list: " + list);    // Empty linked list.

            // Add elements to the linked list.
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            // Print the linked list after adding elements.
            System.out.println("List after adding elements: " + list);  // Expacted output [1, 2, 3, 4, 5]
        }
    }

## Output
    Initial list: []
    List after adding elements: [1, 2, 3, 4, 5]

</details>

<details>
<summary>

# Types of Linked List
</summary>

  1. Singly Linked List
  2. Doubly Linked List
  3. Circular Linked List
</details>

<details>
<summary>

# Advantages & disadvantages of Linked List
</summary>

## Advantages of Linked List
  1. Dynamic Size (No need to specify the size of the list)
  2. Ease of insertion/deletion.
  3. No need to specify size.
  4. No need to shift elements.
  5. No need to allocate memory and deallocate memory.
  6. No need to worry about memory overflow, memory fragmentation, and memory access time.
  7. No need to worry about cache misses.

## Disadvantages of Linked List
  1. Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do binary search with linked lists efficiently with its default implementation.
  2. Extra memory space for a pointer is required with each element of the list.
  3. Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists.

## Applications of Linked List
  1. Implementation of stacks and queues.
  2. Implementation of graphs, hash tables, adjacency lists, and dynamic memory allocation.
  3. Implementation of undo functionality in text editors.
</details>

<details>
<summary>

# Implementation of Linked List
</summary>

   1. Using Arrays
   2. Using Pointers
   3. Using Classes

**Note:** The last node will contain address as NULL to mark the end of the list.
</details>

<details>
<summary>

# Operations on Linked List
</summary>

  1. Insertion
  2. Deletion
  3. Traversal
  4. Searching
  5. Sorting
  6. Reversing, and so on.
  
  **1. Insertion:** There are three types of insertion: <br>
    a. Insertion at the beginning <br>
    b. Insertion at the end <br>
    c. Insertion at a given position <br>
    
  **2. Deletion:** There are three types of deletion: <br>
    a. Deletion at the beginning <br>
    b. Deletion at the end <br>
    c. Deletion at a given position <br>
</details>

<details>
<summary>

# Java - Linked list
</summary>

  - We can implement a linked list in Java using the LinkedList class.
  - The LinkedList class implements the List interface and extends the AbstractSequentialList class.
  - The LinkedList class is a doubly linked list implementation of the List and Deque interfaces.
  - The LinkedList class can also be used as a list, stack or queue.
  - The LinkedList class is a member of the java.util package.

## Syntax of the LinkedList in Java
    LinkedList<DataType> listName = new LinkedList<DataType>();

## Constructors of LinkedList class
   1. LinkedList()
   2. LinkedList(Collection c)
   3. LinkedList(Deque d)
   4. LinkedList(List l)
   5. LinkedList(Queue q)
   6. LinkedList(String s)
   7. LinkedList(String s, Locale l)
   8. LinkedList(String s, Charset c)
   9. LinkedList(String s, CharsetDecoder d) and so on.

## Methods of LinkedList class
   1. add()
   2. addAll()
   3. add(int index, Object element)
   4. clear()
   5. indexOf()
   6. lastIndexOf() and so on.
</details>

<details>
<summary>

# Difference between Linked List and Array, vector, stack, queue, Tree, Graph, and so on.
</summary>

## Linked List vs Array: 
  1. Arrays can be used to store linear data of similar types, but linked lists (generally) consists of nodes where each node contains a data field and a reference(link) to the next node in the list.
  2. Arrays have better cache locality that can make a pretty big difference in performance.
  3. Size of the array is fixed: So we must know the upper limit on the number of elements in advance. Also, generally, the allocated memory is equal to the upper limit irrespective of the usage.
  4. Inserting a new element in an array of elements is expensive because the room has to be created for the new elements and to create room existing elements have to be shifted.
  5. For example, in a system if we maintain a sorted list of IDs in an array id[].
      id[] = [1000, 1010, 1050, 2000, 2040].
      And if we want to insert a new ID 1005, then to maintain the sorted order, we have to move all the elements after 1000 (excluding 1000).
      Deletion is also expensive with arrays until unless some special techniques are used. For example, to delete 1010 in id[], everything after 1010 has to be moved.
  6. Unlike arrays, linked list elements can be easily inserted or removed without reallocation or reorganization of the entire structure because the data items need not be stored contiguously in memory or on disk, while restructuring the linked list uses a little bit more memory than an array because of the storage used by the pointers.

## Linked List vs Vector:
  1. Vector is a dynamic array while linked list is a dynamic list.
  2. Vector is synchronized while linked list is not.
  3. Vector is implemented using array while linked list is implemented using pointers.
  4. Vector is better for storing and accessing data while linked list is better for manipulating data.

## Linked List vs Stack:
  1. Stack is a linear data structure while linked list is a linear or a non-linear data structure.
  2. Stack is a dynamic array while linked list is a dynamic list.
  3. Stack is synchronized while linked list is not.
  4. Stack is implemented using array while linked list is implemented using pointers.
  5. Stack is better for storing and accessing data while linked list is better for manipulating data.

## Linked List vs Queue:
  1. Queue is a linear data structure while linked list is a linear or a non-linear data structure.
  2. Queue is a dynamic array while linked list is a dynamic list.
  3. Queue is synchronized while linked list is not.
  4. Queue is implemented using array while linked list is implemented using pointers.
  5. Queue is better for storing and accessing data while linked list is better for manipulating data.

## Linked List vs Tree:
  1. Tree is a hierarchical data structure while linked list is a linear or a non-linear data structure.
  2. Tree is a dynamic array while linked list is a dynamic list.
  3. Tree is synchronized while linked list is not.
  4. Tree is implemented using array while linked list is implemented using pointers.
  5. Tree is better for storing and accessing data while linked list is better for manipulating data.

## Linked List vs Graph:
  1. Graph is a non-linear data structure while linked list is a linear or a non-linear data structure.
  2. Graph is a dynamic array while linked list is a dynamic list.
  3. Graph is synchronized while linked list is not.
  4. Graph is implemented using array while linked list is implemented using pointers.
  5. Graph is better for storing and accessing data while linked list is better for manipulating data.
</details>

<details>
<summary>

# Shallow Copy and Deep Copy
</summary>

## Shallow Copy:
  - A shallow copy means that only the reference of the object is copied. If any changes are made to a copy of object, it will be reflected in the original object.
  - In Java, all wrapper classes (like Integer, Boolean, Byte etc) and String class are immutable. So, when we assign any variable to another, a copy of the reference is created. For example:

    Integer a = 10; <br>
    Integer b = a; <br>
    b++; <br>
    System.out.println(a); // 10 <br>
    System.out.println(b); // 11

  - In the above example, a copy of the reference of a is created in b. So, any changes made to b will be reflected in a.

  ## Example of Shallow Copy using Linked List:
        import java.util.LinkedList;
        public class ShallowCopy {
          public static void main(String[] args) {
            LinkedList<String> list1 = new LinkedList<String>();

            list1.add("A");
            list1.add("B");
            list1.add("C");
            list1.add("D");

            System.out.println("List1: " + list1);
            
            LinkedList<String> list2 = list1;
            list2.add("E");
            list2.add("F");
            System.out.println("List2: " + list2);
          }
        }

<<<<<<< HEAD
## Deep Copy:
  - A deep copy means that a copy of the object is created. If any changes are made to a copy of object, it will not be reflected in the original object.
  - For example:
=======
# Deep Copy:
  - A deep copy means that a copy of the object is created. If any changes are made to a copy of object, it will not be reflected in the original object. <br>
  For example:
>>>>>>> b5d72e31fc1268925d1eca5343e7367fc2cb99c8

    Integer a = 10; <br>
    Integer b = new Integer(a); <br>
    b++; <br>
    System.out.println(a); // 10 <br>
    System.out.println(b); // 11

  - In the above example, a copy of the object is created in b. So, any changes made to b will not be reflected in a.

  ## Example of deep copy in linked list

        import java.util.LinkedList;
        public class LinkedListExample {
            public static void main(String[] args) {
                LinkedList<String> list = new LinkedList<String>();

                list.add("A");
                list.add("B");
                list.add("C");
                list.add("D");
                list.add("E");
                
                System.out.println("Original List: " + list);
                
                LinkedList<Integer> deepCopy = new LinkedList<Integer>(list);
                System.out.println("Cloned List: " + deepCopy);
            }
        }

</details>

<details>
<summary>

# Difference between Shallow Copy and Deep Copy:
</summary>

  - Shallow copy creates a new object and copies the reference of the original object to the new object. So, any changes made to the new object will be reflected in the original object.
  - Deep copy creates a new object and copies the values of the original object to the new object. So, any changes made to the new object will not be reflected in the original object.
  - Shallow copy is used to copy the object of immutable classes like String, Integer, Boolean etc.
  - Deep copy is used to copy the object of mutable classes like ArrayList, LinkedList, HashMap etc.
  - Shallow copy is faster than deep copy.
  - Deep copy is slower than shallow copy.
</details>
