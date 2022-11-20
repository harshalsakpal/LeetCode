/**
 * https://leetcode.com/problems/shuffle-string/description/
 */
class Solution {
    public String restoreString(String s, int[] indices) {
    
        char[] finalArr = new char[indices.length];

        for(int i=0; i<indices.length; i++) {
            
            finalArr[indices[i]] = s.charAt(i);
        }

        return new String(finalArr);
    }
}