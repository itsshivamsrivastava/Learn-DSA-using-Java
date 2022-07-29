package BinarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        // int [] arr = {2,3,5,9,14,16,18};
        int [] arr = {16,18,25,32,41,52,68};
        int target = 15;
        // int target = 14;
        int ans = ceilingNumber(arr, target);     // ans = 4
        System.out.println(ans);             // 4
    }

    // It should be return the index of smaller number which is greater than or equal to target.
    static int ceilingNumber(int arr[], int target) {
        int start = 0;  // second, third round --> start = 4
        int end = arr.length - 1;   // third round --> end = 3
        while(start <= end){    // start = 4, end = 3
            int mid = start + (end - start) / 2;    // mid = 4 + (4 - 4) / 2 = 4 0 = 4
            if(target < arr[mid]){  // Second round --> target = 12, arr[4] = 15
                end = mid - 1;  // end = 4 - 1 = 3
            }
            else if(target > arr[mid]){ // first round --> target = 12, arr[3] = 9
                start = mid + 1;    // start = 4
            }
            else{
                return mid;
            }
        }
        if(target > arr[arr.length - 1]){
            return -1;
        }
        return start;   // 3rd round --> start = 4
    }
}
