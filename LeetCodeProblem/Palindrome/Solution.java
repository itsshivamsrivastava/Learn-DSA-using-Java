public class Solution {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
    
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;

        while(temp != 0 && temp > 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return reverse == x;
    }
}
