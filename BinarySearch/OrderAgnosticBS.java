package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int [] arr = {-18,-14,-12,0,2,4,5,9,10,22,56,66,70,71,88,91,98};
        int [] arr = {99,80,75,22,11,10,5,2,-3};
        int target = 10;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // find the mid element to find the target.
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
