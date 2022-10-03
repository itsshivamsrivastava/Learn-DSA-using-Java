package Strings;

/*
    796. Rotate String
    Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
    A shift on s consists of moving the leftmost character of s to the rightmost position. 
    For example, if s = "abcde", then it will be "bcdea" after one shift.
    
    Example 1:
        Input: s = "abcde", goal = "cdeab"
        Output: true
    Example 2:
        Input: s = "abcde", goal = "abced"
        Output: false
 */

public class RotateString {
    public static void main(String[] args) {
        // Testcases
        String s = "abcde"; String goal = "cdeab";
        // String s = "abcde"; String goal = "abced";
        // String s = "aa"; String goal = "a";

        System.out.println(rotateString(s, goal));
    }


    public static Boolean rotateString(String s, String goal) {
        
        String temp = s + s;

        if(s.length() == goal.length()){
            temp.contains(goal);
            return true;
        }
        return false;
    }
}
