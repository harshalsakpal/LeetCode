/*
 * https://leetcode.com/problems/count-asterisks/description/
 */
class Solution {
    public int countAsterisks(String s) {
        int output = 0;
        int count = 0;

        if(!s.contains("|") && !s.contains("*")) {
            return output;
        }
        
        for(char ch: s.toCharArray()) {
            if(ch == '*' && count % 2 == 0) {
                output++;
            } 
            if(ch == '|') {
                count++;
            }
        }

        return output;
    }
}