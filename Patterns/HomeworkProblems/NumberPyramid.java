package Patterns.HomeworkProblems;

/*
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
*/
public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        int sum = 1;

        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop - For spaces
            for (int s = 1; s <= n-i; s++){
                System.out.print(" ");
            }
            // Inner loop - For numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(sum + " ");
                // System.out.print(i + " ");
            }
            sum = sum + 1;
            System.out.println();
        }
    }
}
