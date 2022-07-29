package ReverseArrays;

public class ReverseArray {

    static int[] reverseArray(int[] a, int i, int j) {
        if (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            reverseArray(a, i + 1, j - 1);
        }
        return a;
    }

    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        int B[] = reverseArray(A, 0, A.length - 1);
        System.out.println("The elements in reverse array are");
        for (int i : B)
            System.out.print(i + " ");

    }
}
