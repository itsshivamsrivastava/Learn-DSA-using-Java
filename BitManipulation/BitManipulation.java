package BitManipulation;

import java.util.Scanner;

public class BitManipulation {

    /* 
     Bit Manipulation 
     * Get Operation
     * Set Operation
     * Clear Operation
     * Update Operation
     
     * Lecture 14 Notes: https://docs.google.com/document/d/13GQILgmIV5EcfcrdIciwrxXG8EVFKRy_DvLpFmsJD9c/edit
    */
    public static void main(String[] args) {

        // Get Bit Operation
        /*
        Get the 2nd bit (position = 2) of a number n. (n = 0101)
        i.) Bit Mask: 1 << i     (i --> position)
        ii.) Operation: AND

        int n = 5;  // 0101
        // int pos = 2;
        int pos = 3;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
        */

        // Set Bit Operation
        /*
        Set the 2nd bit (position = 1) of a number n. (n = 0101)
        i.) Bit Mask: 1 << i     (i --> position)
        ii.) Operation: OR
        
        int n = 5;  // 0101
        int pos = 1;
        int bitMask = 1 << pos;     // 0001 << 1 => 0010
        
        int newNumber = bitMask | n;    // 0010 | 0101 => 0111 --> (decimal of 7)
        System.out.println(newNumber);
        */

        // Clear Bit Operation
        /*
        Clear the 3rd bit (position = 2) of a number n. (n = 0101)
        i.) Bit Mask: 1 << i     (i --> position)
        ii.) Operation: AND with NOT
        
        int n = 5;  // 0101
        int pos = 2;
        int bitMask = 1 << pos;     // 0001 << 2 => 0100
        int notBitMask = ~(bitMask);    // 1011
        int newNumber = notBitMask & n; // 1011 & 0101 => 0001  --> (Decimal of 1)
        System.out.println(newNumber);
        */

        // Update Bit Operation
        /*
        Update the 2nd bit (position = 1) of a number n to 1. (n = 0101)
        (i --> position)
            For 0 (Clear)                        For 1 (Set)
        Bit Mask: 1 << i                    Bit Mask: 1 << i
        Operation: AND with NOT             Operation: OR
        */

        int n = 5;  // 0101
        int pos = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Operation (0 and 1): ");
        int operation = sc.nextInt();  // Update bit to 1 else update bit to 0

        // Making bit mask accroding to Set operation
        int bitMask = 1 << pos;     // 0001 << 1 => 0010

        if (operation == 1){
            // Set Operation
            int newNumber = bitMask | n;    // 0010 | 0101 => 0111  --> (Decimal of 7)
            System.out.println(newNumber);
        }else{
            // Clear Operation
            int notBitMask = ~(bitMask);    // 1101
            int newNumber = notBitMask & n; // 1101 & 0101 => 0101  --> (Decimal of 5)
            System.out.println(newNumber);
        }
        sc.close();
    }   
}
