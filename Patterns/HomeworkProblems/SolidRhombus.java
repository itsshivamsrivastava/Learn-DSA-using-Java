package Patterns.HomeworkProblems;

/* Soid Rhombus Pattern
    *****
   *****
  *****
 *****
*****
*/
public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;
        
        // Outer loop - Row
        for(int i=1; i<=n; i++){
            /* Inner loops - Columns */

            // Inner loop - for spaces
            for(int s=1; s<=n-i; s++){
                System.out.print(" ");
            }

            // Inner loop - for stars
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
