package BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        // int [] arr = {16,18,25,32,41,52,68};
        int target = 15;
        int ans = floorNumber(arr, target);
        System.out.println(ans);
    }
    // It should be return the index of greatest number which is smaller than or equal to target.
    static int floorNumber(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
