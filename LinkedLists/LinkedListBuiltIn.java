import java.util.LinkedList;

public class LinkedListBuiltIn {
    public static void main(String[] args) {
        
        // Create a linked list.
        LinkedList<Integer> list = new LinkedList<Integer>();

        System.out.println("Initial list: " + list);    // Empty linked list.

        // Add elements to the linked list.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the linked list after adding elements.
        System.out.println("List after adding elements: " + list);

        // Remove elements from the linked list
        list.remove();  // If we do not pass any argument in remove() method, it will remove the first element.
        System.out.println("List after removing first element: " + list);
        
        // Remove the element at specified index
        list.remove(2); // Remove the element at index 2.
        System.out.println("List after removing element at index 2: " + list);

        list.removeLast();  // Remove the last element.
        System.out.println("List after removing Last element: " + list);
        
        // Remove all elements from the linked list.
        // list.clear();
        // System.out.println("List after removing all elements: " + list);

        // Get the element at specified index
        // System.out.println("Element at index 1: " + list.get(0));
        System.out.println();
        
        list.add(0, 1);
        System.out.println("List after adding element at index 0: " + list);

        list.add(3, 4);
        System.out.println("List after adding element at index 3: " + list);

        list.add(4, 5);
        System.out.println("List after adding element at index 4: " + list);

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Size of the linked list: " + list.size());
        System.out.println("Is the linked list empty: " + list.isEmpty());

        // Check if the linked list contains the specified element
        System.out.println("Does the linked list contain 3: " + list.contains(3));

        // Check if the linked list contains all the elements of the specified collection
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        // list2.add(8);
        System.out.println("Does the linked list contain all the elements of list2: " + list.containsAll(list2));

        System.out.println("Index of 3: " + list.indexOf(3));
        System.out.println("Last index of 4: " + list.lastIndexOf(4)); 
        list.set(1, 8); // Set the element at index 1 to 8.
        System.out.println("List after setting element at index 1 to 8: " + list);

        // Get the sub list from the linked list
        LinkedList<Integer> subList = new LinkedList<Integer>();
        subList = new LinkedList<Integer>(list.subList(1, 4));

        // Print the sub list
        System.out.println("Sub list: " + subList);

        // Clone the linked list. It returns a shallow copy of the linked list. 
        System.out.println("Cloned list: " + list.clone());

        // Shallow copy of the linked list
        LinkedList<Integer> shallowCopy = list;
        System.out.println("Shallow copy of the linked list: " + shallowCopy);
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
