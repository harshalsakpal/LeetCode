/*
 * https://leetcode.com/problems/unique-morse-code-words/description/
 */
class Solution {
    final String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueMorseCode = new HashSet<String>();

        for(String word: words) {
            uniqueMorseCode.add(getCode(word));
        }

        return uniqueMorseCode.size();
    }

    private String getCode(String word) {
        StringBuilder wordBuilder = new StringBuilder();
        for(char wordChar: word.toCharArray()) {

            int index = wordChar - 'a';
            wordBuilder.append(new String(codes[index]));
        }

        return wordBuilder.toString();
    }
}