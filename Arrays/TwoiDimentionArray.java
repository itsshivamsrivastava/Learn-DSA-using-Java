import java.util.Scanner;

public class TwoiDimentionArray {
    static void twoiDimentionArray() {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // arr[i][j] = i * j;
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        twoiDimentionArray();
    }
}