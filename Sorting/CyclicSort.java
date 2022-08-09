package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        // int[] arr = { 4,0,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int j = arr[i] - 1; // j is the correct index of the value.
            if (arr[i] != arr[j]) {
                swap(arr, i, j);
            } 
            else {
                i++;
            }
        }
    }

    public static void swap(int[] nums, int first, int correct) {
        int temp = nums[first];
        nums[first] = nums[correct];
        nums[correct] = temp;
    }
}
