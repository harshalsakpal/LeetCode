/*
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 */
class Solution {
    public String reverseWords(String s) {
        StringBuilder output = new StringBuilder();
        String[] sArr = s.split(" ");

        for(String inputSplit: sArr) {
            output.append(reverse(inputSplit));
            output.append(" ");
        }

        return output.toString().trim();
    }

    private String reverse(String sSplit) {

        char[] chArr = sSplit.toCharArray();
        int startIndex = 0;
        int endIndex = chArr.length - 1;

        while(startIndex <= endIndex) {

            char chTemp = chArr[startIndex];
            chArr[startIndex] = chArr[endIndex];
            chArr[endIndex] = chTemp;

            startIndex++;
            endIndex--;
        }

        return new String(chArr);
    }
}