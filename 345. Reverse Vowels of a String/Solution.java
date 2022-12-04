/*
 * https://leetcode.com/problems/reverse-vowels-of-a-string/description/
 */
class Solution {
    private final String vowels = "aeiouAEIOU";

    public String reverseVowels(String s) {
        if(s.length() == 1) {
            return s;
        }

        int startIndex = 0, endIndex = s.length() - 1;
        char[] input = s.toCharArray();

        while(startIndex <= endIndex) {

            if(!vowels.contains(input[startIndex]+"")) {
                startIndex++;
                continue;
            }
            if(!vowels.contains(input[endIndex]+"")) {
                endIndex--;
                continue;
            }

            char temp = input[startIndex];
            input[startIndex] = input[endIndex];
            input[endIndex] = temp;
            
            startIndex++;
            endIndex--;
        }

        return new String(input);
    }
}