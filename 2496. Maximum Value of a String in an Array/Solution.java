/*
 * https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/description/
 */
class Solution {
    public int maximumValue(String[] strs) {
        int output = 0;
        
        for(String input: strs) {
            int internal = onlyDigits(input) ? Integer.valueOf(input) : input.length();            

            output = (internal > output) ? internal : output;
        }

        return output;
    }

    private boolean onlyDigits(String input) {
        
        for(int i=0; i<input.length(); i++) {
            if(Character.isLetter(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}