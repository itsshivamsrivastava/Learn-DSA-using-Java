public class BreakPalindrome {
    public static void main(String[] args) {
        BreakPalindrome bp = new BreakPalindrome();

        String palindrome = "abccba";
        System.out.println(bp.breakPalindrome(palindrome));        
    }
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() == 1){
            return "";
        }
        else{
            char [] pp = palindrome.toCharArray();
            for(int i = 0; i < pp.length/2; i++){
                if(pp[i] != 'a'){
                    pp[i] = 'a';
                    return(new String(pp));
                }
            }
            pp[pp.length-1] = 'b';
            return(new String(pp));
        }
    }
}
