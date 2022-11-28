/*
 * https://leetcode.com/problems/length-of-last-word/description/
 */
class Solution {
    public int lengthOfLastWord(String s) {
        
        int output = 0;

        for(int iCount=s.length()-1; iCount>=0; iCount--) {

            if(s.charAt(iCount) != ' ') {
                output++;
            }

            if(s.charAt(iCount) == ' ' && output > 0) {
                break;
            }
        }

        return output;
    }
}