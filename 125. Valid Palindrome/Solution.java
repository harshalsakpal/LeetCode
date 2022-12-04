/*
 * https://leetcode.com/problems/valid-palindrome/description/
 */
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1) {
            return true;
        }

        StringBuilder input = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                input.append(String.valueOf(s.charAt(i)).toLowerCase());
            }
        }

        int startIndex = 0;
        int endIndex = input.length() - 1;

        while(startIndex <= endIndex) {
            if(input.charAt(startIndex) != input.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }

        return true;
    }
}