package Sorting;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 2, 4 };
        // int[] arr = { 10, 20, 20, 30, 10 };
        // int[] arr = { 1, 2, 3, 4, 5 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Bubble Sort
    static void bubbleSort(int[] arr) {

        // Length of the array
        int n = arr.length;
        boolean swapped;

        // My approach:
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        // Traverse through all array elements
        // for(int i = 0; i < n; i++){
        // // Last i elements are already in place, so we don't need to check them.
        // // Note: when j never swap for a single iteration (value of i), it means the
        // array is sorted, hence we can end the progrm over here.
        // for(int j = 1; j <= n-i-1; j++){
        // if(arr[j] < arr[j-1]){
        // int temp = arr[j];
        // arr[j] = arr[j-1];
        // arr[j-1] = temp;
        // }
        // }
        // }
    }
}