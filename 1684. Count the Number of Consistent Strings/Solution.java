/*
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
 */
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int output = 0;

        for(String word: words) {

            for(char ch: allowed.toCharArray()) {

                word = word.replaceAll(Character.valueOf(ch).toString(), "");
                if(word == "") {
                    output++;
                    break;
                }
            }            
        }

        return output;
    }
}