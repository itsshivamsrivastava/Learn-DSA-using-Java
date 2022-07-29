package Patterns;

public class InvertHalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        
        // Outer loop
        for (int i = 1; i <=n; i++) {
            // System.out.print(n-i+1 +". ");
            for (int j = 0; j <=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Another simple approach -  This approach is the best approach for invert half pyramid.
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
