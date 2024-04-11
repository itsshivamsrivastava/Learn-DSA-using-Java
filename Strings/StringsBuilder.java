package Strings;

public class StringsBuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);
        
        // charAt() Method
        // System.out.println(sb.charAt(0));

        // setCharAt(index, new_character)
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // insert(index, new_character)
        // sb.insert(2, 'n');
        // System.out.println(sb);

        // delete(strat_index, end_index)
        // sb.delete(2, 4);
        // System.out.println(sb);

        // StringBuilder sb = new StringBuilder("h");  // for string: str = str + 'h'
        // sb.append("e");     // str = str + 'e'
        // sb.append("l");     // str = str + 'l'
        // sb.append("l");     // str = str + 'l'
        // sb.append("o");     // str = str + 'o'
        // System.out.println(sb);
        // System.out.println(sb.length());
        

        /* Question Time - Reverse String */
        StringBuilder sb = new StringBuilder("hello");
        for(int i = 0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            
            /* Replace the front char with back char and back char with front char */
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

        /* Lecture No. 13 Notes: https://docs.google.com/document/d/14XwQZtfkFQhig8qN9q4EHtQozU7D7nxGoI1NG9UYvu8/edit */

    }    
}