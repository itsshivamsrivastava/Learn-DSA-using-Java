package Searching;

public class SearchingInRange {
    public static int search(int[] arr, int target, int start, int end){
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 3; // average case and time complexity is O(n)

        System.out.println(search(arr, target, 1, 4));
        
    }
}
