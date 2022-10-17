package Strings;

public class PangramCheck {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        // String sentence = "leetcode";

        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        int [] count = new int[26];
        
        for(int i=0; i<sentence.length(); i++){
            // count[sentence.charAt(i) - 'a']++;
            // ascii value of 'a' is --> 97
            // sentence.charAt(i) is 'a' --> 97 - 97 = 0 that means character 'a' is not
            count[sentence.charAt(i)-97]++; 
        }
        
        for(int i=0; i<26; i++){
            if(count[i] == 0){
                return false;
            }
        }
        return true;
    }
}
