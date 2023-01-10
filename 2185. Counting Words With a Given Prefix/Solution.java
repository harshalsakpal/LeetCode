/*
 * https://leetcode.com/problems/counting-words-with-a-given-prefix/description/
 */
class Solution {
    public int prefixCount(String[] words, String pref) {
        int output = 0;

        for(String word: words) {

            if(word.indexOf(pref) == 0) {
                output++;
            }
        }

        return output;
    }
}