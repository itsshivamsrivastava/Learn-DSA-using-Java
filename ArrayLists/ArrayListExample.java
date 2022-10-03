import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        
        // Methods of ArrayList.

        // Add elements to the list ArrayList.
        list.add(45);
        list.add(456);
        list.add(846);
        list.add(124);
        list.add(2354);
        
        System.out.println(list);

        // Update the element at the specified index list ArrayList.
        list.set(0, 98);
        System.out.println(list);
        
        // Remove the element at the specified index list ArrayList.
        list.remove(4);
        System.out.println(list);
        
        // Get the size of the list ArrayList.
        System.out.println("Length of list ArrayList = " + list.size());
        
        // To check if the list contains the element which is passed in list ArrayList.
        System.out.println("If list ArrayList is contains 846, then it returns " + list.contains(846)); 
        
        // To check if ArrayList is empty.
        System.out.println("If list ArrayList is empty, then it returns " + list.isEmpty());
        
        // Print the list ArrayList.
        System.out.println(list);
        
        // Another ArrayList.
        
        // Add elements to the list1 ArrayList.
        ArrayList<Integer> list1 = new ArrayList<Integer>(10);
        // list1.add(456);
        // list1.add(846);
        // list1.add(124);
        // list1.add(4561);
        // list1.add(1234);
        // list1.add(2354);
        
        // before add list ArrayList elements to list1 ArrayList, list1 is empty.
        System.out.println(list1);
        System.out.println(list1.addAll(list));

        // Addition is done after add elements to list1 ArrayList.
        System.out.println(list1);
    }
}

/*
    Java interview questions:
    
    Q1. What is the difference between ArrayList and LinkedList?
    Ans 1. ArrayList is implemented using dynamic array and LinkedList is implemented using doubly linked list.

    Q2. What is the difference between ArrayList and Vector?
    Ans 2. ArrayList is not synchronized and Vector is synchronized.

    Q3. What is the difference between ArrayList and Stack?
    Ans 3. ArrayList is not synchronized and Stack is synchronized.

    Q4. What is the difference between ArrayList and HashSet?
    Ans 4. ArrayList is ordered and HashSet is unordered.

    Q5. What is the difference between ArrayList and HashMap?
    Ans 5. ArrayList is ordered and HashMap is unordered.

    Q6. What is the difference between ArrayList and TreeSet?
    Ans 6. ArrayList is ordered and TreeSet is ordered.
            
    Q7. What is the difference between ArrayList and TreeMap?
    Ans 7. ArrayList is ordered and TreeMap is ordered.

*/