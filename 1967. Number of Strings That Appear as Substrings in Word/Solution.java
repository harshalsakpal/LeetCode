/*
 * https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/
 */
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int output = 0;

        for(String pattern: patterns) {

            if(word.indexOf(pattern) != -1) {
                output++;
            }
        }

        return output;
    }
}