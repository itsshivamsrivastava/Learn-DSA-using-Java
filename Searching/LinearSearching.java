package Searching;

public class LinearSearching {
    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int searchString(String str, char target){
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7,8,9,10};
        // int target = 5; // average case and time complexity is O(n)
        // int target = 1; // best case and time complexity is O(1)
        // int target = 45; // Worst case scenario and time complexity is O(n)
        // System.out.println(linearSearch(arr, target));

        String str = "Hello World";
        char target = 'o'; // average case and time complexity is O(n)
        // char target = 'H'; // best case and time complexity is O(1)
        // char target = 'z'; // Worst case scenario and time complexity is O(n)
        System.out.println(searchString(str, target));
    }
}
