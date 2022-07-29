package Patterns;

public class ButterflyPattern {

    /* Butterfly Pattern
                    Stars||Space||Stars
      *      *        1      6      1
      **    **        2      4      2
      ***  ***        3      2      3
      ********        4      0      4
      ********        4      0      4
      ***  ***        3      2      3
      **    **        2      4      2
      *      *        1      6      1

    */

    public static void main(String[] args) {
        int n = 4;

        /* Above part of the butterfly */
        // Outer loop
        for(int i=1; i<=n; i++){
            /* Inner loops */
            // 1st part - Left half pyramid
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            // Spaces between these pyramids - Spaces => 2*(n-i)
            for (int s = 2*(n-i); s >= 1; s--) {
                System.out.print(" ");
            }
            // 2nd part - Right half pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /* Below part of the butterfly - Inverted part of pyramid */
        // Outer loop
        for(int i=n; i>=1; i--){
            // Inner loops
            // 1st part - Left Inverted half pyramid
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            // Spaces between these pyramids - Spaces => 2*(n-i)
            for (int s = 1; s <= 2*(n-i); s++) {
                System.out.print(" ");
            }
            // 2nd part - Right Inverted half pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}