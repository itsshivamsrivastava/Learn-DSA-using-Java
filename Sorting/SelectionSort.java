package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        // int arr[] = {2,-32,0,78,1};
        int n = arr.length;
        selectionSort(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // Selection Sort
    static void selectionSort(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int min = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
