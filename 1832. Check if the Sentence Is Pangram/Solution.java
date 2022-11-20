/*
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
 */
class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Set<Character> uniqueLowerCaseChars = new HashSet<>();

        for(char oneCharInput: sentence.toCharArray()) {
            
            uniqueLowerCaseChars.add(oneCharInput);
            if(uniqueLowerCaseChars.size() >= 26) {
                
                return true;
            }
        }
        return false;
    }
}