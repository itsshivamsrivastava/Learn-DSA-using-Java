public class ArraysExamples {
    public static void main(String[] args) {
        
        // Declare and set size of the array.
        // int [] arr = new int[3];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

        // Declare and initialize the array.
        // int [] arr = {1, 2, 3};
        // for(int i = 0; i <arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // First declare the array and then allocate the memory of an array.
        // int arr[];
        // arr = new int[3];   // Memory Allocation
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

        // First declare the array and then initialize the array.
        int arr[];  // Decleration of array.
        arr = new int[]{1, 2, 3}; // Initialize the array.
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        /* Methods of arrays in Java */
        // 1. Length of array.
        System.out.println(arr.length);
        
        // 2. Accessing elements of array.
        System.out.println(arr[0]);

        // 3. Accessing elements of array using for loop.
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 4. Accessing elements of array using for each loop.
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        // 5. Accessing elements of array using enhanced for loop.
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        /* Both are valid declarations */
        // int intArray[]; 
        // or int[] intArray; 

        // byte byteArray[];
        // short shortsArray[];
        // boolean booleanArray[];
        // long longArray[];
        // float floatArray[];
        // double doubleArray[];
        // char charArray[];

        // Creating the Test class object.
        Test test = new Test();
        // Calling the method of Test class
        int [] arr1 = test.m1();

        // Accessing the elements of array
        // Time complexity: O(n)
        // Space complexity: O(1)
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
    }
}

// Returning the array from the method
class Test{
    public int[] m1(){
        // Returning an array
        return new int[]{1, 2, 3};
    }
}
