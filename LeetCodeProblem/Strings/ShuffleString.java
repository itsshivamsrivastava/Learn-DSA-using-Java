package Strings;

/*
    1528. Shuffle String
    You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
    Return the shuffled string.
    
     Input:
        j = 4 5 6 7 0 2 1 3
            c o d e l e e t
    Output: 
            l e e t c o d e
        i = { 0 1 2 3 4 5 6 7 }
 */

public class ShuffleString {
    public static void main(String[] args) {
        // String s = "codeleet";
        // int [] indices = {4,5,6,7,0,2,1,3};

        String s = "mvasih";
        int [] indices = {5,3,4,0,2,1};

        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char [] str = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            str[indices[i]] = s.charAt(i);
        }
        
        return s = new String(str);
    }
}
