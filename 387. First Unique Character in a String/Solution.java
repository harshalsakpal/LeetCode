/*
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 */
class Solution {
    public int firstUniqChar(String s) {
        int startIndex = 0;

        for(int i=0; i<s.length(); i++) {
            char toFind = s.charAt(startIndex);

            for(int j=0; j<s.length(); j++) {
                
                if(toFind == s.charAt(j) && (j != startIndex) ) {
                    break;
                }
                if( j == s.length() - 1) {
                    return startIndex;
                }
            }
            startIndex++;
        }

        return -1;
    }
}