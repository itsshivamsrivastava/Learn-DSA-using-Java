package BinarySearch;

public class Smallestletter {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        char [] letters = {'c','f','j'};
        char target = 'a';
        // char target = "c";
        // char target = "d";

        char ans = sol.nextGreatestLetter(letters, target);
        System.out.println(ans);
    }
}

class Solution4 {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
