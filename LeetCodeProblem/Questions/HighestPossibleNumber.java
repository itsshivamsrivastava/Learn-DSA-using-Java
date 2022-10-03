package Questions;

/*
    Question: Write a function that, given a non-negative integer, return the highest digits in descending order. In other words, rearrange the digits to create the highest possible number.

    For example:
    42145 will return 54421
 */

public class HighestPossibleNumber {
    public static void main(String[] args) {
        int num = 42145;
        highestPossibleNumber(num);
    }

    private static void highestPossibleNumber(int num) {
        // Convert number into integer array
        String str = Integer.toString(num);
        int[] arr = new int[str.length()];
        
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i) - '0';
        }

        // Alternet way to convert number into integer array
        // int[] arr = Integer.toString(num).chars().map(c -> c-'0').toArray();
        // for (int i : arr) {System.out.print(i + " ");}
        // System.out.println();

        // Sort the array in increasing order
        bubbleSort(arr);

        // Print the array in reverse order
        reverseArray(arr);
    }
    
    /* Method for sorting the array in increasing order */
    private static void bubbleSort(int[] arr) {
        // Length of the array
        int n = arr.length;
        boolean swapped;

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
    }

    /* Method for print the array in reverse order */
    private static void reverseArray(int[] arr) {
        int result = 0;
        // Print the array in reverse order
        for (int i = arr.length - 1; i >= 0; i--){
            result = result * 10 + arr[i];
        }
        System.out.println(result);
    }
}
