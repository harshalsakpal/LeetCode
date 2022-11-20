/**
 * https://leetcode.com/problems/single-row-keyboard/description/
 */
class Solution {
    public int calculateTime(String keyboard, String word) {
        
        int runningCounter = 0;
        for(int i=0; i<word.length(); i++) {

            int indexCurrentChar = keyboard.indexOf(word.charAt(i));
            int indexPreviousChar = i == 0 ? 0 : keyboard.indexOf(word.charAt(i-1));

            runningCounter = runningCounter + Math.abs(indexPreviousChar - indexCurrentChar);            
        }

        return runningCounter;
    }
}