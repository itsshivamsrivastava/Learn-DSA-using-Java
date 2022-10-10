package Strings;

/* Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, 
then reverse the first k characters and left the other as original.

Example 1:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

Example 2:
Input: s = "abcd", k = 2
Output: "bacd"

Constraints:
1 <= s.length <= 104
s consists of only lowercase English letters.
1 <= k <= 104
*/

public class ReverseStringII {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcdefg";
        int k = 2;
        String result = sol.reverseStr(s, k);
        System.out.println(result);
    }
}

class Solution {
    public String reverseStr(String s, int k) {

        // 1. Convert the string to a character array
        char [] str = s.toCharArray();

        // 2. Iterate through the array
        for(int i = 0; i < str.length; i += 2*k){

            // 3. Reverse the first k characters
            int left = i;
            int right = Math.min(i+k-1, str.length-1);
            while(left<right){
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
        return s = new String(str);
    }
}