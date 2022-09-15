import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {

        /* 
        Linked List: 
        

        */

        
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