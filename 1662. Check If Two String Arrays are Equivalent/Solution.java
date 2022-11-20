/*
 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
 */
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String word1Str = String.join("", word1);
        String word2Str = String.join("", word2);
        
        return (word1Str.equals(word2Str)) ? true : false;        
    }
}