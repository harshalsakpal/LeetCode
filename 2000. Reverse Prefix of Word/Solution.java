/*
 * https://leetcode.com/problems/reverse-prefix-of-word/description/
 */
class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder output = new StringBuilder();

        int index = word.indexOf(ch);

        for(int i=index; i>=0; i--) {
            output.append(word.charAt(i));
        }
        
        String remaining = word.substring(output.length(), word.length());

        output.append(remaining);

        return output.toString();
    }
}