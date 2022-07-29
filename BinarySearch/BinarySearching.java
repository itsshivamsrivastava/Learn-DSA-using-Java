package BinarySearch;

public class BinarySearching {
    public static void main(String[] args) {
        int arr[] = {-18,-14,-12,0,2,4,5,9,10,56,66,70,71,88,91,98};
        int target = 88;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            // find the mid element to find the target.
            int mid = start + (end - start) / 2;
            
            // Compare the target with the mid element and place in the left hand side.
            if(target < arr[mid]){
                end = mid - 1;
            }
            
            // Compare the target with the mid element and place in the right hand side.
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
