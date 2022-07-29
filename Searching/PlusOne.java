package Searching;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int l = digits.length;
        int i = l - 1;
    
        if (digits[i] == 9) {
            while (i >= 0 && digits[i] == 9) {
                // digits[i] = 0;
                --i;
            }
            if (i == -1) {
                int[] ans = new int[l + 1];
                ans[0] = 1;
                return ans;
            }
            digits[i]++;
            for (int j = i + 1; j < l; j++) {
                digits[j] = 0;
            }
        } else {
            digits[i]++;
        }
        
        return digits;
    }

    public static void main(String[] args) {

        /* Test Cases */
        int digits[] = { 1, 2, 3 };                         // Test Case 1
        // int digits[] = { 4, 3, 2, 1 };                   // Test Case 2
        // int digits[] = { 9 };                            // Test Case 3
        // int digits[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };    // Test Case 4
        // int digits[] = { 8, 9, 9, 9, 9, 9 };             // Test Case 5
        
        /* Answer */
        int[] ans = plusOne(digits);
        
        /* Print the array */
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
