// Learn from Shardha Didi (Apna College)
public class Recursion2 {
    // Q1. Print all permutations of a string.
    public static void printPermutation(String str, String permutation) {
        int StrLength = str.length();
        if (StrLength == 0) {
            System.out.println(permutation);
            return;
        }

        // The total number of permutation = n x (n-1) x (n-2) = n!
        // So, the Time Complexity = O(n!)
        for (int i = 0; i < StrLength; i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newString, permutation + currentChar);
        }
    }

    // Q2. Count total paths in a maze to move from (0,0) to (m,n).
    public static int countPaths(int i, int j, int n, int m) {

        // Base conditions
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // move downwards
        int downPaths = countPaths(i + 1, j, n, m);

        // move right
        int rightPaths = countPaths(i, j + 1, n, m);

        // Addition of downPaths and rightPaths
        int result = downPaths + rightPaths;
        return result;
    }
    
    public static void main(String[] args) {
        
        // Q1. Print all permutations of a string.
        // String str = "abc";
        // printPermutation(str, "");

        // Q2. Count total paths in a maze to move from (0,0) to (m,n).
        int n = 3, m = 3;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);

    }
}