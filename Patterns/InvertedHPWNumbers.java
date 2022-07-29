package Patterns;

public class InvertedHPWNumbers {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop
        for(int i=n; i>=1; i--){
            // Inner loop
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Another approach");
        // Another approach
        
        // Outer loop
        for(int i=1; i<=n; i++){
            // Inner loop
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
