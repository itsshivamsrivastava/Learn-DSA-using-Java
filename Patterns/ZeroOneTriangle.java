package Patterns;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop
        for(int i=1; i<=n; i++){
            // Inner loop
            for (int j=1; j<=i; j++) {
                if((i+j)%2 == 0){   // Even
                    System.out.print("1 ");
                }
                else{   //Odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
