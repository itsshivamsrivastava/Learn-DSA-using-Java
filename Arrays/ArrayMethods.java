import java.util.Arrays;

public class ArrayMethods {

    // Program to showcase asList() method
    static int [] arrayAsList(int [] arr) {
        // Fetching Array
        // Converting elements into list
        System.out.println("The Integer Array as a List = " + Arrays.asList(arr));
        return arr;
    }
    
    public static void main(String[] args) {
        int arr[] = { 10, 30, 35, 52, 75 };
        arrayAsList(arr);
    }
}
