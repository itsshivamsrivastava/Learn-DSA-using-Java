package Strings;

import java.util.ArrayList;

/* 
    Question: Given an array of strings, find and return the longest string in the array which is made from other strings in the array.
    If there are no such strings, return "null"

    For example:
    longest(basket, basketball, foot, football, tennis, bigtennisball) will return bigtennisball
 */
public class LongestString {

    public String longestString(String[] str) {
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[j].contains(str[i])) {
                    temp.add(str[j]);
                }
            }
        }
        temp.sort((a, b) -> a.length() - b.length());   // Sorting in assending
        System.out.println(temp);

        return temp.remove(temp.size() - 1);    // Removed and return the last element
    }

    public static void main(String[] args) {
        LongestString ls = new LongestString();

        String[] str = { 
            "basket", "basketball", 
            "foot", "football", 
            "tennis", "bigtennisball" 
        };
        System.out.println("Longest Element: " + ls.longestString(str));
    }
}