package Patterns;

public class RightRotatedHalfPyramid {
    public static void main(String[] args) {
        /*
               *
              **
             ***
            **** 
        */
        int n = 4;

        // Outer loop
        for (int i = 1; i <= n; i++) {
            
            // Inner loop for Spaces
            for (int s = 1; s <= n-i; s++) {
                System.out.print(" ");
            }

            // Inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
