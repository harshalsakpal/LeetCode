/*
 * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

    Example 1:
    Input: "ab-cd"
    Output: "dc-ba"

    Example 2:
    Input: "a-bC-dEf-ghIj"
    Output: "j-Ih-gfE-dCba"
    
    Example 3:
    Input: "Test1ng-Leet=code-Q!"
    Output: "Qedo1ct-eeLg=ntse-T!"
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