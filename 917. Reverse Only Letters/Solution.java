/*
 * https://leetcode.com/problems/reverse-only-letters/
 */
class Solution {
    public String reverseOnlyLetters(String s) {
        int startIndex = 0;
        int endIndex = s.length() - 1;
        char[] finalString = s.toCharArray();

        while(startIndex <= endIndex) {

            if(!Character.isLetter(s.charAt(startIndex))) {                
                startIndex++;                
                continue;
            }

            if(!Character.isLetter(s.charAt(endIndex))) {
                endIndex--;
                continue;
            }

            if(Character.isLetter(s.charAt(startIndex)) && Character.isLetter(s.charAt(endIndex))) {
                char stageEndChar = s.charAt(endIndex);
                finalString[endIndex] = s.charAt(startIndex);
                finalString[startIndex] = stageEndChar;

                startIndex++;
                endIndex--;
            }
        }
        return new String(finalString);
    }
}