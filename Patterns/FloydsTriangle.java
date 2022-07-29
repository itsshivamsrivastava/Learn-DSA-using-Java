package Patterns;

public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 5;
        int number = 0;

        // Outer loop
        for(int i=1; i<=n; i++){
            // Inner loop
            for (int j=1; j<=i; j++) {
                if(number<=15){
                    number = number + 1;
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }
    }
}
