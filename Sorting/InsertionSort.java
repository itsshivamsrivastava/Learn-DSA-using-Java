package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};
        // int arr[] = {2,-32,0,78,1};
        // int arr[] = {78,1};
        int n = arr.length;
        insertionSort(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }

    // Insertion Sort
    static void insertionSort(int [] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int j = i + 1;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

    }
}
