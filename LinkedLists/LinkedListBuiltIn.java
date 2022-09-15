import java.util.LinkedList;

public class LinkedListBuiltIn {
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

        // Remove elements from the linked list
        list.remove();  // Remove the first element. If we do not pass any argument in remove() method, it will remove the first element.
        System.out.println("List after removing first element: " + list);
        
        // Remove the element at specified index
        list.remove(2); // Remove the element at index 2. Expected output: [2, 3, 5]
        System.out.println("List after removing element at index 2: " + list);

        list.removeLast();  // Remove the last element. Expected output: [2, 3]
        System.out.println("List after removing Last element: " + list);
        
        // // Remove all elements from the linked list.
        // list.clear();
        // System.out.println("List after removing all elements: " + list);

        // // Get the element at specified index
        // System.out.println("Element at index 1: " + list.get(0));  // Expected output: IndexOutOfBoundsException: Index: 0, Size: 0

        System.out.println();
        
        // Adding more elements to the linked list
        list.add(0, 1);     // Add element 1 at index 0. Expected output: [1, 2, 3]
        System.out.println("List after adding element at index 0: " + list);

        list.add(3, 4);     // Add element 4 at index 3. Expected output: [1, 2, 3, 4]
        System.out.println("List after adding element at index 3: " + list);
        
        list.add(4, 5);     // Add element 5 at index 4. Expected output: [1, 2, 3, 4, 5]
        System.out.println("List after adding element at index 4: " + list);

        // Get the first element
        System.out.println("First element: " + list.getFirst());  // Expected output: 2

        // Get the last element
        System.out.println("Last element: " + list.getLast());  // Expected output: 3


        // Get the element at specified index
        System.out.println("Element at index 1: " + list.get(1));  // Expected output: 3

        // Get the size of the linked list
        System.out.println("Size of the linked list: " + list.size());  // Expected output: 2

        // Check if the linked list is empty
        System.out.println("Is the linked list empty: " + list.isEmpty());  // Expected output: false

        // Check if the linked list contains the specified element
        System.out.println("Does the linked list contain 3: " + list.contains(3));  // Expected output: true

        // Check if the linked list contains all the elements of the specified collection
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        // list2.add(8);
        System.out.println("Does the linked list contain all the elements of list2: " + list.containsAll(list2));  // Expected output: true

        // Get the index of the specified element
        System.out.println("Index of 3: " + list.indexOf(3));  // Expected output: 2

        // Get the last index of the specified element
        System.out.println("Last index of 4: " + list.lastIndexOf(4)); // Expected output: 3

        // Set the element at specified index
        list.set(1, 8); // Set the element at index 1 to 8. Expected output: [1, 8, 3, 4, 5]
        System.out.println("List after setting element at index 1 to 8: " + list);
        
        // Get the sub list from the linked list
        LinkedList<Integer> subList = new LinkedList<Integer>();
        // subList = (LinkedList<Integer>) list.subList(1, 4); // It throws ClassCastException: class java.util.SubList cannot be cast to class java.util.LinkedList.
        subList = new LinkedList<Integer>(list.subList(1, 4)); // Expected output: [8, 3, 4]

        // Print the sub list
        System.out.println("Sub list: " + subList);

        // Clone the linked list. It returns a shallow copy of the linked list. 
        System.out.println("Cloned list: " + list.clone());     // Expected output: [1, 8, 3, 4, 5]

        // Shallow copy of the linked list
        LinkedList<Integer> shallowCopy = list;
        System.out.println("Shallow copy of the linked list: " + shallowCopy);  // Expected output: [1, 8, 3, 4, 5]
        System.out.println("Original list: " + list);
        
        // Set the element at index 3 to 9 in the shallow copy of the linked list
        shallowCopy.set(3, 9);
        System.out.println("Add 9 at index 3 of the Shallow copy of list: " + shallowCopy);
        // Remove the element at index 2 from the shallow copy of the list
        shallowCopy.remove(2);
        System.out.println("Remove element at index 2 of the Shallow copy of list: " + shallowCopy);
        System.out.println("Original list: " + list);
        

        // Deep copy of the linked list
        LinkedList<Integer> deepCopy = new LinkedList<Integer>(list);

        // Set the element at index 3 to 9 in the deep copy of the linked list
        deepCopy.set(1, 11);
        System.out.println("Deep copy of the linked list: " + deepCopy);
        System.out.println("Original list: " + list);
    }
}
