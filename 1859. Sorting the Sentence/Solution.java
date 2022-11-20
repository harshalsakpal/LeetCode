/**
 * https://leetcode.com/problems/sorting-the-sentence/description/
 */
class Solution {
    public String sortSentence(String s) {
        
        String[] input = s.split(" ");
        String[] output = new String[input.length];

        for(String splitInput: input) {
            String inputNumber = "";

            for(Character inputChar: splitInput.toCharArray()) {

                if(Character.isDigit(inputChar)) {
                    inputNumber += String.valueOf(inputChar);
                }
            }

            int index = Integer.valueOf(inputNumber).intValue();

            output[index-1] = splitInput.replaceAll(String.valueOf(index), "");
        }

        return String.join(" ", output);
    }
}