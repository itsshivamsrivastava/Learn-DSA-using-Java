package Recursion;

public class CountZeros {
    static int countZero(int n, int c) {
        if (n == 0) {
            return c;
        }
        int remender = n % 10;
        if (remender == 0) {
            return countZero(n/10, c + 1);
        }
        return countZero(n / 10, c);
    }
    public static void main(String[] args) {
        System.out.println(countZero(30204, 0));
    }
}
