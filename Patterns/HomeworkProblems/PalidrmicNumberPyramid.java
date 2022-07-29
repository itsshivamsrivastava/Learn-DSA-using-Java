package Patterns.HomeworkProblems;

/*               r => i
    1             r=1
   212            r=2
  32123           r=3
 4321234          r=4
543212345         r=5

*/

public class PalidrmicNumberPyramid {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop - For spaces
            for (int s = 1; s <= n-i; s++){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
