/*
 * https://leetcode.com/problems/reverse-string/description/
 */
class Solution {
    public void reverseString(char[] s) {
        int endIndex = s.length -1;
        int startIndex = 0;

        while(endIndex >= startIndex ) {

            char chTemp = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = chTemp;

            startIndex++;
            endIndex--;
        }
        return;
    }
}